# 01 — Fundamentos da pesquisa (seu "estudo" antes da aula)

> Este documento é para **você**, apresentador. É a base que sustenta tudo o que vai ser dito na aula — com fontes — para você falar com segurança e responder perguntas difíceis.
> Pesquisa feita em novembro de 2026, nas documentações oficiais do Lovable, Anthropic (Claude), OpenAI e Google, em skills de design open-source no GitHub e em estudos recentes sobre prompts.

---

## TL;DR — as 10 ideias que sustentam a aula

1. **Quando você não decide, a IA decide pela média.** Prompt vago = layout "médio" do que existe na internet (o famoso *AI slop*: gradiente roxo, fonte Inter, 3 cards com ícone…).
2. **Prompt bom é briefing bom.** A IA é um "profissional brilhante e recém-contratado, sem contexto nenhum sobre o seu cliente". Ela precisa do mesmo briefing que um designer freela precisaria.
3. **Contexto vale mais que "você é o melhor designer do mundo".** Estudo da Wharton (dez/2025) mostrou que personas de especialista **não** aumentam precisão. O que melhora o resultado é contexto e instrução clara.
4. **Explique o porquê.** Dizer *por que* você quer algo faz a IA generalizar melhor do que dar ordens soltas.
5. **Texto real, nada de lorem ipsum.** Copy real muda o layout, o espaçamento e a hierarquia. Placeholder gera página de template.
6. **Palavras de "vibe" mudam o design de verdade.** "Editorial", "cinematográfico", "brutalista", "premium e calmo" alteram tipografia, espaçamento, sombra, raio de borda e paleta.
7. **Dê permissão, direção e coerência.** Liberar a IA para "sair do genérico, usar 3D, scroll e ilustração" funciona (a Anthropic recomenda pedir explicitamente para ir além do básico). O salto vem quando você **descreve cada momento** e quando **todo efeito nasce da marca**. Efeito sem motivo, igual em todas as seções, é a nova cara de IA.
8. **Começo e fim do prompt pesam mais.** O mais importante vai no início (o que é e para quem). As regras de qualidade vão no fecho.
9. **Construa em camadas, não de uma vez.** Primeiro um prompt estruturado para a página, depois ajustes **por seção**, com o que muda e o que **não** pode mudar.
10. **Use IA para escrever o prompt (meta-prompting).** O próprio Lovable recomenda isso — é a base do Gem/Skill que você vai entregar no fim da aula.

---

## 1. Por que a IA entrega genérico

- **OpenAI** (guia de frontend para o GPT-5.4): *"Quando o prompt é pouco específico, os modelos recorrem a padrões de alta frequência nos dados de treino… o resultado costuma ser plausível e funcional, mas deriva para estrutura genérica, hierarquia visual fraca e escolhas aquém do que imaginamos."*
- **Anthropic** (guia de prompting do Claude): *"Sem orientação, os modelos tendem a padrões genéricos, que criam o que os usuários chamam de estética 'AI slop'."*
- Isso vale para **qualquer** ferramenta (Lovable, v0, Bolt, Claude, Gemini). O problema não é a ferramenta — é o pedido.

### Os sinais de "cara de IA" (para o slide do joguinho "aponte os sinais")
Compilado da skill `frontend-design` da Anthropic, do guia de frontend da OpenAI, da skill **Impeccable** (pbakaus) e de artigos de designers:

| Sinal | Por que acontece |
|---|---|
| Gradiente roxo → azul (e texto em gradiente) | Paleta padrão do Tailwind/indigo, a mais vista no treino |
| Fonte Inter/Roboto em tudo | É a fonte de interface mais comum |
| Hero → 3 cards iguais com ícone → depoimentos → CTA | A estrutura "média" de landing page |
| "Selo" acima de todo título (ex.: `✨ NOVIDADE`, texto pequeno em CAIXA ALTA) | Tique de template |
| Emoji no lugar de ícone | Atalho barato |
| Cards dentro de cards, sombra cinza igual em tudo | "Kit SaaS" |
| Bolhas/orbs de gradiente desfocadas no fundo | Decoração sem função |
| Numeração 01 / 02 / 03 sem ser uma sequência real | Estética de template |
| Fundo creme + título serifado + destaque terracota | Novo "padrão elegante" da IA |
| Headline genérica: "Transforme seu negócio com…", "Revolucione…" | Copy média |
| Fade + slide-up igual em **todas** as seções, hover em **todos** os cards | Animação "padrão de IA" |

> Frase para a aula: **"O problema não é a IA ser ruim. É ela ser média. E média não vende."**

### O "teste da marca" (OpenAI)
*"Se, tirando o menu, a primeira dobra pudesse ser de outra marca, a marca está fraca demais."* — ótimo critério para o pessoal de mídia avaliar qualquer LP.

---

## 2. Prompt bom = briefing bom

- **Anthropic**: *"Pense no modelo como um funcionário brilhante, mas novo, que não tem contexto das suas normas e fluxos. Quanto mais precisamente você explicar o que quer, melhor o resultado."*
- **Teste do colega** (Anthropic): mostre seu prompt para um colega sem contexto. Se ele ficaria confuso, a IA também fica.
- **Lovable** (Prompting best practices): antes de abrir o Lovable, responda 4 perguntas — *O que é? Para quem é? Por que vão usar? Qual é a UMA ação que a pessoa deve fazer?*
- **Google** (guias do Gemini/Gems): estrutura em 4 partes — Persona, Tarefa, Contexto, Formato — e "não precisa usar todas, mas usar algumas já ajuda".

👉 Isso é linguagem nativa de agência: **briefing**. Por isso a fórmula da aula se chama **BRIEF** (ver roteiro).

---

## 3. O mito do "você é o melhor designer do mundo"

- **Wharton — Prompting Science Report 4 (dez/2025)**: testaram 6 modelos com perguntas de nível pós-graduação. Personas de especialista **não** melhoraram significativamente a precisão. Personas desencontradas às vezes pioraram.
- Ressalva honesta: o estudo mede **precisão**, não estética. Anthropic e OpenAI ainda recomendam definir um papel porque ele **ajuda no tom e no foco**. Ou seja: uma linha de papel não faz mal, mas não é ela que faz a mágica.
- **Conclusão para a aula:** *gaste suas palavras no cliente, não no elogio.* Isso **confirma a sua experiência pessoal**: colocar detalhes completos do cliente é o que mais melhora o resultado.

---

## 4. Explique o porquê (contexto e motivação)

- **Anthropic**: dar a razão por trás de uma instrução ajuda o modelo a generalizar. Exemplo: em vez de "NUNCA use reticências", diga "o texto vai ser lido por um leitor de voz, então não use reticências".
- Aplicação em LP: em vez de "formulário curto", diga "formulário curto, porque o tráfego vem de Instagram Ads no celular e cada campo a mais derruba conversão".
- O pessoal de mídia **tem** esse contexto (origem do tráfego, público da campanha, objeção principal). Isso é ouro para o prompt.

---

## 5. Texto real em vez de lorem ipsum

- **Lovable**: *"Placeholder não dá nada para o Lovable reagir. Conteúdo real não só gera layouts e espaçamentos melhores, como revela problemas cedo (uma headline real pode precisar de duas linhas)."*
- **OpenAI**: dar copy real, contexto de produto e objetivo é *"uma das formas mais simples de melhorar o resultado"*.
- Na prática: headline, subtítulo, CTA, diferenciais, números, FAQ — mesmo que ainda não seja a versão final.

---

## 6. Vocabulário de "vibe" (buzzwords)

- **Lovable**: termos como *minimal, expressive, cinematic, playful, premium* "não são enfeite: influenciam tipografia, espaçamento, sombra, raio de borda e paleta". Use cedo, e de preferência em toda seção. *"Bold, saturated colors" funciona melhor que "colorful".*
- A documentação oficial do Lovable traz **20 direções de estilo** com palavras-chave (resumidas no dicionário do material pós-aula). Exemplos:
  - **Premium e sleek** → refined, translucent surfaces, layered depth, soft blur, elevated accents
  - **Bold e disruptivo** → grid-heavy, brutalist, raw typography, high contrast, oversized CTAs
  - **Editorial** → magazine-style grid, typographic hierarchy, pull quotes, featured imagery
  - **Futurista e cinematográfico** → dark mode, cosmic gradient, glowing edges, motion blur
  - **Orgânico e natural** → earth tones, flowing shapes, hand-drawn elements, botanical
- Dá para **misturar por seção**: hero "bold e disruptivo", preços "calmo e tranquilizador".
- **Comportamento importante do Lovable (2026):** se o prompt deixa o visual em aberto ("crie uma landing page para minha startup"), o Lovable mostra **perguntas de design** (paleta, tipografia, layout). Se você já define fontes, cores e estilo, ele **pula as perguntas e constrói direto**. Ou seja: quem decide o visual no prompt está no controle.

---

## 7. Animação, 3D e "fator uau": permissão, direção e coerência

Aqui a pesquisa **confirma e refina** a sua intuição.

**Confirma (permissão):**
- **Anthropic**: prompts como *"inclua o máximo de funcionalidades e interações relevantes. Vá além do básico"* funcionam melhor que pedidos secos. Se você quer mais do que o mínimo, **peça explicitamente**.
- **Anthropic** (snippet oficial de estética): *"faça frontends criativos e distintos, que surpreendam e encantem… use animações para efeitos e microinterações… crie atmosfera e profundidade em vez de fundos sólidos."*
- **OpenAI**: *"Entregue pelo menos 2–3 movimentos intencionais em trabalhos visuais."*

**Refina (direção):**
- **Anthropic**: *"Um único momento orquestrado — uma sequência de carregamento ou uma revelação — impressiona mais que efeitos espalhados. Fade-and-slide-up em cada seção e hover em todo card são o padrão genérico e parecem gerados por IA."*
- **Anthropic**: *"Gaste sua ousadia em um lugar só. Deixe um elemento ser o memorável e mantenha o resto quieto e disciplinado."* (+ o conselho da Chanel: antes de sair, tire um acessório.)
- **OpenAI** dá a receita dos 3 movimentos:
  1. uma **entrada** no hero;
  2. um efeito **ligado ao scroll** (sticky, parallax, profundidade);
  3. uma **microinteração** (hover, revelação, transição) que deixe claro o que é clicável.
  Regras: perceptível numa gravação rápida, suave no celular, rápido e contido, consistente, e **removido se for só enfeite**.

**O que a prática ensinou (e ajustou a leitura das fontes):**
LPs de vitrine construídas na agência mostram que uma página pode ter **vários** momentos de movimento e continuar sofisticada, desde que eles formem uma única coreografia tirada da marca. Na LP da Vingô, por exemplo:
- as **folhas do brandbook** viram objetos 3D no hero (WebGL, com luz e reflexo, reagindo ao mouse);
- o manifesto **acende palavra por palavra** com a rolagem;
- os números trocam numa **seção fixa**, com a folha em **linha fina** girando ao fundo;
- a folha volta em **traço** nos capítulos, em **neon** no formulário e o nome da marca fecha **gigante no rodapé**;
- tipografia fina gigante, linhas de 1 px e granulado amarram tudo.

Ou seja: o conselho "um momento só" das fontes vale para **efeitos soltos**. Quando todos os efeitos contam a mesma marca, a página fica rica sem ficar genérica. A regra prática virou: **permissão + direção + coerência**.

👉 **Fórmula da aula:** *"Tire o cenário de dentro da marca. Dê liberdade para 3D e scroll, descreva cada momento e corte qualquer efeito que não venha da marca ou da história."*

**Repertório técnico que o Lovable entende** (não precisa saber programar, só nomear):
- Movimento: *Framer Motion (Motion), scroll-triggered reveals, staggered animation, parallax, sticky scroll storytelling, Ken Burns, kinetic typography, marquee, count-up, smooth scroll (Lenis), GSAP ScrollTrigger*.
- 3D/visual: *Three.js / React Three Fiber, Spline (embed de cena 3D), ilustração vetorial em SVG animado, glassmorphism, grain/noise texture, mesh gradient, bento grid*.
- O Lovable instala bibliotecas npm sozinho: basta nomear a biblioteca ou descrever o efeito (doc oficial "Using npm packages").
- Componentes prontos: o Lovable documenta oficialmente o uso do **21st.dev** (biblioteca de heros, navbars, depoimentos animados com "prompt para Lovable" pronto para copiar).
- Técnica avançada que está em alta: **vídeo "scrubado" pelo scroll** (uma animação gerada por IA, tipo Kling/Veo, vira uma sequência de frames que avança conforme a rolagem — o efeito "Apple"). Vale como curiosidade/slide extra, não como conteúdo principal.

**Piso de qualidade (o que nunca pode faltar):** responsivo mobile-first, contraste legível, respeitar "reduzir movimento" (prefers-reduced-motion), carregamento rápido. Para o pessoal de mídia: **LP lenta derruba conversão e a experiência da página nos anúncios** (o guia de tendências do Lovable cita: 53% dos usuários de celular abandonam páginas que demoram mais de 3 s; meta de LCP < 2,5 s).

---

## 8. Estrutura e narrativa

- **Lovable**: pense em transições — *o que a pessoa vê primeiro? O que gera confiança? O que dá coragem para agir? Para onde a ação leva?* "Toda seção tem que ter motivo para existir e motivo para levar à próxima."
- **OpenAI**: estrutura típica de página de marketing: Hero (identidade e promessa) → Imagem de apoio (contexto) → Detalhe do produto → Prova social → CTA final. E: **uma função por seção** (explicar, provar, aprofundar ou converter). *"Se apagar 30% do texto melhora a página, continue apagando."*
- **OpenAI**: "orçamento do hero" — marca, uma headline, uma frase de apoio, um grupo de CTA e uma imagem dominante. Nada de selos, chips e caixinhas por cima.

---

## 9. Fluxo profissional no Lovable (o "além do básico")

Nomes e recursos conforme a documentação oficial em nov/2026 — **confira na interface no dia**, porque o Lovable muda rápido.

| Recurso | Para que usar em LP | Detalhe útil |
|---|---|---|
| **Plan mode** | Antes de construir: o Lovable lê o projeto, faz perguntas e propõe um plano editável. | 1 crédito por mensagem (+ pesquisa, se houver). Não mexe no código. |
| **"Me faça perguntas"** | Fecho de prompt: *"Antes de construir, me faça as perguntas que precisar."* | Recomendação oficial do Lovable. |
| **Perguntas de design** | Prompt vago → o Lovable pergunta paleta, tipografia e layout com amostras visuais. | Se você já define o visual, ele pula e constrói direto. |
| **Anexos** | Anexar **manual da marca (PDF)**, briefing (Word/PPT), prints de referência, arquivo **.fig** do Figma. | Até 10 arquivos por mensagem. Dá para desenhar sobre a imagem anexada. |
| **Importar site pela URL** | Redesenhar o site **que o cliente já tem** partindo dele. | Só para sites próprios/do cliente. Lê textos, imagens, fontes, cores. |
| **Geração de imagens** | Pedir imagens no estilo da LP ("gere a foto do hero…"). | Gasta créditos; peça qualidade alta quando houver texto/detalhe. |
| **Preview toolbar** (substituiu o antigo Visual Edits) | Selecionar um elemento e pedir a mudança; editar texto direto; **desenhar** anotação; comentar. | Apontar é melhor que descrever. |
| **Instructions** (antigo Knowledge) | Guardar a direção visual e o contexto do cliente no projeto; regras da agência no **workspace**. | 3 níveis: workspace, projeto, pessoal. Workspace até 10 mil caracteres. |
| **Skills** | "Playbooks" reutilizáveis, chamados com `/` (ex.: `/lp-agencia`). | Workspace (admins), pessoais e as nativas do Lovable (acessibilidade, redesign, SEO). |
| **Histórico de versões + bookmark** | Marcar versões boas e ousar sem medo. | Reverter restaura o código. |
| **Follow-ups** | Mandar mensagem enquanto ele trabalha. | Várias mudanças? **Uma lista numa mensagem só** é mais confiável que várias rápidas. |
| **SEO e metadados** | Título, descrição, favicon, imagem de compartilhamento. | Tem revisão de SEO/AEO nativa. |

**Prompts oficiais que valem ouro:**
- Passada de polimento (doc oficial): *"Faça uma passada crítica no app inteiro. Ajuste tipografia e espaçamento. Melhore estados vazios e de carregamento. Corrija tudo que parecer genérico. Não adicione funcionalidades. Não mude cores, a menos que algo esteja ilegível."*
- Explorar antes de construir: *"Descreva três direções para o hero antes de construir qualquer coisa."*
- Reverse meta-prompting: *"Escreva as instruções do projeto com base no que construímos até agora."* (vira o "manual" daquele cliente)
- Mudança com limite: *"[o que fazer] + [onde] + [o que não pode mudar]"*. Ex.: "Só altere a seção de preços. Mantenha o estilo atual e não mexa no hero."

**Regras de ouro de iteração (Lovable):**
- Um assunto por prompt. *"Se você escreveu 'e' mais de duas vezes, divida o prompt."*
- Prompt por componente/seção, não a página toda de novo.
- Use verbos precisos: *substitua, atualize, ajuste* — em vez de "melhore isso".
- Se "Try to fix" falhou 2 vezes, mude de tática: Plan mode + "investigue a causa antes de mudar o código".

---

## 10. Verbos de ajuste (vocabulário de direção de arte)

Inspirado nos comandos da skill **Impeccable** (uma das mais usadas para design com agentes de código). Funcionam como pedidos curtos para iterar:

| Pedido | Quando usar |
|---|---|
| **Mais ousado** (*bolder*) | A página está "segura" demais, sem personalidade |
| **Mais calmo** (*quieter*) | Está barulhenta, com efeito demais |
| **Enxugue** (*distill*) | Tem elemento e texto sobrando |
| **Mais cor** (*colorize*) | Está cinza e sem vida |
| **Tipografia** (*typeset*) | Hierarquia de títulos fraca, fontes sem personalidade |
| **Ritmo e espaço** (*layout*) | Espaçamento apertado ou irregular |
| **Anime** (*animate*) | Falta resposta visual às ações |
| **Encante** (*delight*) | Falta um detalhe memorável |
| **Polimento** (*polish*) | Passada final antes de publicar |
| **Critique** (*critique*) | Peça uma crítica de UX antes de mudar |

---

## 11. Meta-prompting: IA escrevendo o prompt

- **Lovable Prompting Bible**: um dos níveis de prompting é usar a IA para refinar o prompt (*"Reescreva este prompt para ser mais conciso e detalhado"*) e, no fim, pedir para documentar o que funcionou (*"crie um prompt que eu possa usar da próxima vez"*).
- **Google (Gems)**: o próprio Gemini oferece "usar o Gemini para reescrever as instruções".
- 👉 Justificativa do material pós-aula: **um assistente (Skill no Claude / Gem no Gemini) que transforma o briefing do cliente em prompt BRIEF pronto para o Lovable.**

---

## 12. Prompt em português ou inglês?

- O Lovable entende português muito bem e a copy da página sai em português.
- Recomendação: **escreva em português e mantenha os termos de design em inglês** quando não houver tradução consagrada (*parallax, glassmorphism, bento grid, hover, sticky scroll, Ken Burns*). São os "nomes dos ingredientes" que a IA reconhece.

---

## Fontes principais

**Lovable (oficial)**
- Prompting best practices — https://docs.lovable.dev/prompting/prompting-one
- Prompt library (20 estilos + template) — https://docs.lovable.dev/prompting/prompting-library
- Design guidance (perguntas de design) — https://docs.lovable.dev/features/design-guidance
- Plan mode — https://docs.lovable.dev/features/plan-mode
- Instructions (antigo Knowledge) — https://docs.lovable.dev/features/knowledge
- Skills — https://docs.lovable.dev/features/skills
- Preview toolbar — https://docs.lovable.dev/features/preview-toolbar
- Project chat (anexos, imagens, follow-ups) — https://docs.lovable.dev/features/projects/chat
- How to build a real product — https://docs.lovable.dev/tips-tricks/from-idea-to-app
- Import website — https://docs.lovable.dev/features/projects/import-website
- 21st.dev no Lovable — https://docs.lovable.dev/tips-tricks/21stdev
- npm packages — https://docs.lovable.dev/tips-tricks/npm-packages
- Créditos — https://docs.lovable.dev/introduction/credits-and-usage
- Changelog — https://docs.lovable.dev/changelog
- The Lovable Prompting Bible — https://lovable.dev/blog/2025-01-16-lovable-prompting-handbook
- 10 Website Design Trends 2026 — https://lovable.dev/guides/website-design-trends-2026

**Engenharia de prompt (oficial)**
- Anthropic — Prompting best practices (inclui seção de frontend) — https://platform.claude.com/docs/en/build-with-claude/prompt-engineering/claude-prompting-best-practices
- Anthropic — Improving frontend design through skills — https://claude.com/blog/improving-frontend-design-through-skills
- OpenAI — Designing delightful frontends with GPT-5.4 — https://developers.openai.com/blog/designing-delightful-frontends-with-gpt-5-4
- OpenAI — Frontend prompt instructions — https://developers.openai.com/api/docs/guides/frontend-prompt
- Google — Gemini for Workspace prompting guide 101 — https://services.google.com/fh/files/misc/gemini-for-google-workspace-prompting-guide-101.pdf
- Google — Gems — https://support.google.com/gemini/answer/15235603

**Skills de design no GitHub**
- anthropics/skills — frontend-design — https://github.com/anthropics/skills/tree/main/skills/frontend-design
- pbakaus/impeccable — https://github.com/pbakaus/impeccable
- nextlevelbuilder/ui-ux-pro-max-skill — https://github.com/nextlevelbuilder/ui-ux-pro-max-skill
- Leonxlnx/taste-skill — https://github.com/Leonxlnx/taste-skill
- openai/skills — frontend-skill — https://github.com/openai/skills

**Estudos**
- Wharton GAIL — Prompting Science Report 4: Expert personas don't improve factual accuracy — https://gail.wharton.upenn.edu/research-and-insights/playing-pretend-expert-personas/ (arXiv 2512.05858)
