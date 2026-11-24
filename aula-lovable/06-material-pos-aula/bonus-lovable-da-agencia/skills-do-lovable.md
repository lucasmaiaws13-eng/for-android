# Skills para o workspace do Lovable

Skills do Lovable são "playbooks" chamados com `/` no chat do projeto (ou aplicados automaticamente quando o pedido combina). São criadas por owners/admins em **Workspace settings → Skills**, com nome, descrição e instruções em markdown. Também dá para criar como **Personal skill** (Account settings → Personal skills), só para você.

Abaixo, duas skills prontas para colar.

---

## Skill 1 — `lp-brief`

**Nome:** `lp-brief`

**Descrição (quando usar):**
Use quando o usuário pedir uma nova landing page de campanha ou colar um briefing de cliente. Organiza o pedido na fórmula BRIEF, pergunta o que faltar e só então constrói.

**Instruções:**
```markdown
# LP com a fórmula BRIEF

Quando esta skill for usada, antes de escrever qualquer código:

1. Organize o pedido do usuário nas 5 partes e mostre um resumo curto (máximo 12 linhas):
   - B (Base do negócio): cliente, o que vende, público, diferencial, tom de voz.
   - R (Resultado): ação única, texto do CTA, campos do formulário, origem do tráfego.
   - I (Identidade): cores em HEX, fontes, estilo de imagem. Se houver brandbook anexado, extraia daí.
   - E (Estrutura): seções na ordem, com a função de cada uma.
   - F (Fator uau): 1 entrada marcante no hero, 1 grande momento de scroll ligado ao assunto do cliente, microinterações discretas.
2. Se faltar o que o cliente vende, para quem ou qual é a ação da página, faça no máximo 5 perguntas, com uma sugestão de resposta para cada. Se não faltar, não pergunte.
3. Se não houver direção visual, proponha uma específica para o segmento (vibe em 3 palavras, paleta HEX de 4 a 6 cores, 2 fontes do Google Fonts que não sejam Inter/Roboto/Arial) e siga com ela.
4. Construa seguindo as Instructions do workspace e do projeto:
   - textos reais no tom da marca, sem clichês e sem inventar dados (use [inserir]);
   - mobile-first, CTA repetido, formulário com consentimento LGPD;
   - sem cara de template: nada de gradiente roxo decorativo, emojis como ícone, cards idênticos em grade, selos acima dos títulos;
   - respeite prefers-reduced-motion.
5. Ao terminar, sugira 3 próximos ajustes, cada um no formato "o que muda + onde + o que não pode mudar".
```

---

## Skill 2 — `revisao-lp`

**Nome:** `revisao-lp`

**Descrição (quando usar):**
Use antes de publicar uma landing page ou quando o usuário pedir uma revisão. Faz uma checagem de marca, conversão, cara de IA, mobile e conformidade, sem alterar nada sem autorização.

**Instruções:**
```markdown
# Revisão de LP antes de publicar

Não altere o código nesta etapa. Analise a página e entregue um relatório curto com:

1. Teste da marca: escondendo o logo, a primeira dobra ainda parece desta marca? (sim/não + por quê)
2. Conversão: existe uma ação principal clara? O CTA tem o mesmo texto em toda a página? O formulário pede só o necessário e tem consentimento LGPD com link da política de privacidade?
3. Cara de IA: aponte ocorrências de gradiente roxo decorativo, emojis como ícone, cards idênticos em grade, selos acima de títulos, bolhas de fundo, frases clichê, o mesmo efeito de animação em todas as seções.
4. Mobile (390 px): textos cortados, botões pequenos, elementos sobrepostos, animações travando.
5. Qualidade: contraste dos textos, imagens pesadas, título/descrição/imagem de compartilhamento.
6. Conteúdo: dados que parecem inventados (números, depoimentos, preços) e pontos que precisam de validação jurídica em segmentos regulados.

Termine com uma lista priorizada (Crítico, Importante, Polimento) e pergunte quais itens o usuário quer que você corrija.
```
