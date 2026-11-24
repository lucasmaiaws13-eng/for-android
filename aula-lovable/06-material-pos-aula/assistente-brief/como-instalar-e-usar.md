# Assistente BRIEF: como instalar e usar

O assistente transforma o briefing de um cliente em um prompt pronto para o Lovable, seguindo a fórmula **BRIEF** da aula. Tem duas versões com o mesmo conteúdo: **Gem** (Gemini) e **Skill** (Claude). Use a da ferramenta que você já usa.

---

## Opção A — Gem no Gemini (mais fácil de compartilhar com o time)

**Quem cria (uma vez):**
1. Acesse gemini.google.com → menu lateral → **Gems** → **Novo Gem**.
2. **Nome:** `Assistente BRIEF — LPs no Lovable`
3. **Descrição (opcional):** "Cole o briefing do cliente e receba o prompt pronto para o Lovable."
4. **Instruções:** cole todo o conteúdo de `gem-gemini/instrucoes-do-gem.txt`.
5. **Conhecimento:** envie os 3 arquivos de `gem-gemini/conhecimento/` (`dicionario.txt`, `segmentos.txt`, `exemplo-brota.txt`). Se preferir, converta-os em Google Docs antes. Gems com arquivos do Drive ou do computador podem ser compartilhados.
6. Salve e teste com os casos de teste abaixo.
7. **Compartilhar:** no Gem, use **Compartilhar** e mande o link no grupo. Dê acesso de **Leitor** para o time (só quem precisa editar recebe **Editor**).

> Quem recebe o link consegue ver as instruções do Gem. Isso é ok aqui: não há nada confidencial nelas.

---

## Opção B — Skill no Claude

**Cada pessoa instala na própria conta:**
1. No claude.ai: **Settings (Configurações) → Capabilities → Skills**. Se for pedido, ative a execução de código/criação de arquivos.
2. **Upload skill** → escolha `skill-claude/brief-lovable.zip`.
3. Pronto. Numa conversa nova, é só colar o briefing e dizer: "monta o prompt BRIEF para o Lovable". O Claude carrega a skill sozinho quando o pedido combina.

> Se a agência usa um plano Team/Enterprise, um admin pode disponibilizar a skill para todo mundo. Vale perguntar.
> Se o upload falhar, a alternativa é criar um **Projeto** no Claude com o conteúdo do `SKILL.md` nas instruções do projeto e os 3 arquivos de `references/` como conhecimento.

---

## Como usar (qualquer versão)

**Para criar um prompt:** cole tudo o que você tem do cliente, do jeito que estiver: briefing, e-mail do cliente, transcrição de áudio, texto do site. Se tiver brandbook, cole as cores e fontes (ou anexe o PDF). Exemplo:

> preciso de uma LP pra clínica Sorriso Vivo, odontologia em Curitiba, campanha de clareamento no Google e Meta, querem agendamento por WhatsApp, público 25 a 45, cores azul-petróleo e branco, sem brandbook

Ele vai:
1. perguntar só o que for crítico (no máximo 5 perguntas);
2. devolver o **prompt principal** pronto para colar no Lovable;
3. dizer **o que anexar**;
4. sugerir os **próximos prompts de ajuste**;
5. escrever o texto das **Instructions do projeto** no Lovable;
6. listar as **suposições** que fez (confira sempre).

**Para revisar um prompt seu:** "Revisa esse prompt com o BRIEF:" + seu prompt.

**Para ajustar uma LP já gerada:** "No Lovable, o hero ficou poluído e o formulário está longe demais. Me dá os prompts de ajuste."

---

## Casos de teste (rode depois de instalar)

1. **Criar, com pouca informação:** "LP para um curso online de Excel para iniciantes, captação de leads para aula gratuita." → Deve fazer poucas perguntas OU entregar com suposições claras, direção visual específica (não roxo), e um "uau" ligado ao tema (ex.: planilha que se preenche no scroll).
2. **Criar, com brandbook:** cole o exemplo da Brota (`exemplo-brota.txt`, só a parte "Entrada"). → Deve usar exatamente as cores e fontes informadas.
3. **Revisar:** "Revisa: Crie uma landing page moderna e bonita para minha clínica de estética com formulário." → Deve dar notas baixas, apontar o que falta e reescrever, com alerta de compliance para estética.
4. **Ajustar:** "Ficou animação demais, está tudo se mexendo." → Deve devolver um prompt curto do tipo "mantenha só X e Y, remova o resto, não mexa em Z".

Se o resultado fugir disso, confira se as instruções foram coladas inteiras e se os arquivos de conhecimento foram enviados.
