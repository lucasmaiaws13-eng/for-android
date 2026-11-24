# Aula: IA para criação de LPs com Lovable — Agência Mestre

> **Ideia central:** *Prompt bom é briefing bom.* A IA é um freela brilhante que nunca ouviu falar do seu cliente; se você não decide, ela decide pela média. A fórmula **BRIEF** (Base, Resultado, Identidade, Estrutura, Fator uau + Carimbo) transforma o briefing que a agência já sabe fazer num prompt que gera LP com cara de marca.

Duração: 30 min + perguntas · Público: time geral da agência (mídia, atendimento, conteúdo, design).

---

## O que tem aqui

| Arquivo / pasta | Para quê | Quem usa |
|---|---|---|
| `01-fundamentos-da-pesquisa.md` | A pesquisa que sustenta a aula (Lovable, Anthropic, OpenAI, Google, skills de design no GitHub, estudo da Wharton), com fontes | Você, para estudar e responder com segurança |
| `02-roteiro-e-slides.md` | **O roteiro da aula, slide a slide:** texto da tela, visual/animação e o que falar, com tempos. Base para o deck da fase 2 | Você (ensaio) + eu (montar o deck) |
| `03-exemplo-vingo-prompts.md` | O case fictício: cliente, brandbook, prompt genérico × prompt BRIEF, mapa "trecho do prompt → resultado", inventário de capturas | Você + deck |
| `04-faq-possiveis-duvidas.md` | Respostas completas para as dúvidas prováveis (base dos slides extras X1–X9) | Você |
| `exemplos/vingo-brandbook/` | Brandbook da marca fictícia **Vingô** (HTML + PDF) e logos em SVG | Demo |
| `exemplos/lp-generica/index.html` | A LP "cara de IA" (resultado do prompt de sempre) | Demo |
| `exemplos/lp-espetacular/index.html` | A LP BRIEF, com livro 3D, ramo que cresce no scroll, letreiro, teste interativo e chuva de folhas | Demo ao vivo |
| `exemplos/capturas/` | Prints (2x) e vídeos MP4 das duas LPs, prontos para os slides | Deck |
| `05-material-pos-aula/guia-de-bolso-brief.md` | A "cola" de 1–2 páginas para mandar no grupo | Time |
| `05-material-pos-aula/assistente-brief/` | **Assistente BRIEF**: Skill para o Claude (`.zip` pronto) e Gem para o Gemini (instruções + 3 arquivos de conhecimento) + guia de instalação e casos de teste | Time |
| `05-material-pos-aula/bonus-lovable-da-agencia/` | Texto das *Instructions* do workspace do Lovable (padrão Mestre) + 2 Skills do Lovable (`/lp-brief`, `/revisao-lp`) | Admin do Lovable da agência |


---

## Checklist para amanhã de manhã (≈1 hora)

1. **Ler o roteiro** (`02-roteiro-e-slides.md`, ~15 min). Marque o que quiser mudar no seu jeito de falar.
2. **Abrir as duas LPs** no navegador do computador (`exemplos/lp-generica/index.html` e `exemplos/lp-espetacular/index.html`). Mexa o mouse no livro, role até o ramo, clique no teste de luz, envie o formulário.
3. **Me mandar a identidade da Mestre** (lista abaixo) → eu monto o deck seguindo o roteiro.
4. **Criar o Gem** (10 min) seguindo `05-material-pos-aula/assistente-brief/como-instalar-e-usar.md` e rodar os 4 casos de teste. Pegue o link de compartilhamento: ele entra no slide 25.
5. **(Opcional, 15 min)** Rodar o prompt BRIEF no Lovable com o brandbook anexado (`03-exemplo-vingo-prompts.md`, seção 7) para ter também um resultado 100% Lovable.
6. **Ensaiar uma vez cronometrando.** Meta: chegar no Ato 4 (slide 18) até 19:00. Se passar, corte nesta ordem: slide 6 → 16 → 23.

## O que eu preciso para a fase 2 (o deck)

- Logo da Mestre (SVG ou PNG transparente, versões clara e escura)
- Cores da marca (HEX) e fontes (ou o nome delas)
- Um template ou 2–3 slides/peças da agência como referência de estilo (se houver)
- Formato final: PowerPoint/Google Slides, ou um deck em HTML (permite as animações de destaque com mais fidelidade e roda no navegador)
- Seu nome como vai aparecer na capa
- O link do Gem (para o QR code do slide 25)

---

## Mensagem pronta para o grupo (pós-aula)

> Pessoal, obrigado pela aula! Aqui está o material:
> 📌 **Guia de bolso BRIEF**: a fórmula, o modelo de prompt para copiar, o dicionário de palavras e os pedidos de ajuste → [anexar guia]
> 🤖 **Assistente BRIEF no Gemini**: cole o briefing do cliente e receba o prompt pronto para o Lovable → [link do Gem]
> 🤖 **Versão Claude** (Skill): Configurações → Capabilities → Skills → enviar o arquivo → [anexar brief-lovable.zip]
> 💡 Desafio: na próxima LP, testem o BRIEF e mandem aqui o antes e depois!
> Prompt bom é briefing bom. 🌱

---

## Decisões que tomei durante a noite (e por quê)

- **Fórmula BRIEF:** uma sigla em linguagem nativa de agência (*briefing*) em vez de jargão de engenharia de prompt. É fácil de lembrar e posiciona o time como especialista, não como iniciante em IA.
- **Sua intuição sobre animações foi confirmada e refinada.** A pesquisa mostra que **dar permissão** para sair do genérico funciona (a Anthropic recomenda pedir explicitamente para "ir além do básico"). Mas o melhor resultado vem com **direção**: 1 entrada + 1 grande momento de scroll + microinterações. Animação em tudo é justamente um dos sinais de "cara de IA". Na aula isso virou "permissão + direção".
- **Contexto do cliente > persona:** também confirmado. O estudo da Wharton (2025) não achou ganho de precisão com "você é um especialista"; o que muda o resultado é contexto. Isso valida sua experiência de colocar tudo sobre o cliente no prompt.
- **Marca fictícia renomeada de "Brota" para "Vingô":** descobri que existe uma empresa real chamada Brota (hortas inteligentes, mesmo ramo). Para não confundir a plateia nem usar marca alheia, troquei tudo para **Vingô** (de planta que "vingou"). O broto do logo virou o acento do "ô" e a mensagem de sucesso do formulário virou "Vingou!".
- **Imobiliário → e-book:** troquei o exemplo do lançamento imobiliário pelo e-book com formulário, como você pediu, e criei o brandbook antes de qualquer prompt.
- **LPs construídas por mim como demonstração fiel** de cada prompt (você liberou o "demonstrativo"). O FAQ traz a resposta honesta para o caso de alguém perguntar se foram feitas no Lovable, e a seção 7 do arquivo 03 mostra como gerar uma versão 100% Lovable em 15 min.
- **Bônus para a agência:** *Instructions* do workspace e duas Skills do Lovable. Configurado uma vez, o padrão Mestre vale para todos os projetos de todo mundo.
