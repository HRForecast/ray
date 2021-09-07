{{/*
Compute clusterMaxWorkers as the sum of per-pod-type max workers.
*/}}
{{- define "ray.clusterMaxWorkers" -}}
{{- $total := 0 }}
{{- range .Values.podTypes }}
{{- $total = add $total .maxWorkers }}
{{- end }}
{{- $total }}
{{- end }}

{{- define "helpers.list-env-variables"}}
{{- range $key, $val := .Values.env.secret }}
- name: {{ $key }}
  valueFrom:
    secretKeyRef:
      name: app-env-secret
      key: {{ $key }}
{{- end}}
{{- range $key, $val := .Values.env.normal }}
- name: {{ $key }}
  value: {{ $val | quote }}
{{- end}}
{{- end }}
