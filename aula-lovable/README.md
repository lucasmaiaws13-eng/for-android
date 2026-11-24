# Aula: IA para criação de LPs com Lovable · Agência Mestre

> **Ideia central:** *Prompt bom é briefing bom.* A IA é um freela brilhante que nunca ouviu falar do seu cliente; se você não decide, ela decide pela média. A fórmula **BRIEF** (Base, Resultado, Identidade, Estrutura, Fator uau + Carimbo) transforma o briefing que a agência já sabe fazer num prompt que gera LP com cara de marca.

30 minutos + perguntas · público geral da agência.

---

## Links (páginas privadas, só você acessa até compartilhar)

| O quê | Link |
|---|---|
| **Apresentação** (deck em HTML, identidade Mestre) | https://claude.ai/artifact/CbGVEH9fvDGhSpeQjhFVFR |
| LP da Vingô, versão BRIEF (cinematográfica) | https://claude.ai/artifact/LfUyk1eTUr1QZ4zfbUFf89 |
| LP da Vingô, versão "cara de IA" | https://claude.ai/artifact/X2fdTrpPeumEWK4NeB5tfg |
| Brandbook da Vingô | https://claude.ai/artifact/Mxmyr1seAGc2vurbGd9n11 |

Para mostrar a alguém fora da sua conta, use o menu Share de cada página. O deck também roda local: abra `apresentacao/index.html` no Chrome.

---

## O que tem aqui

| Arquivo / pasta | Para quê |
|---|---|
| `apresentacao/index.html` + `assets/` | **O deck.** 32 slides + 6 extras: 12 boas práticas de prompt (fraco × forte), o prompt completo, 8 dicas de Lovable, os assistentes. Transições, demos animadas, vídeos e notas do apresentador (tecla N) |
| `02-guia-da-apresentacao.md` | **Guia resumido:** como usar o deck, tempos (29 min) e o que falar em cada slide |
| `01-fundamentos-da-pesquisa.md` | A pesquisa que sustenta a aula, com fontes |
| `03-exemplo-vingo-prompts.md` | O case Vingô: brandbook, prompt de sempre, prompt completo, mapa "trecho do prompt → resultado" e inventário de capturas |
| `04-faq-possiveis-duvidas.md` | Respostas para as dúvidas prováveis (base dos slides extras) |
| `exemplos/vingo-brandbook/` | Brandbook da marca fictícia (HTML + PDF) e logos em SVG |
| `exemplos/lp-generica/` | A LP "cara de IA" |
| `exemplos/lp-espetacular/` | A LP BRIEF: livro 3D em WebGL entre folhas 3D, manifesto que acende, números fixos, letreiro, capítulos na horizontal, teste de luz, neon e marca gigante no rodapé |
| `exemplos/capturas/` | Prints e vídeos das duas LPs da Vingô |
| `05-material-pos-aula/guia-de-bolso-brief.md` | A "cola" para mandar no grupo |
| `05-material-pos-aula/assistente-brief/` | **Assistente BRIEF:** Skill do Claude (`.zip` pronto) e Gem do Gemini (instruções + 3 arquivos), com guia de instalação e casos de teste |
| `05-material-pos-aula/bonus-lovable-da-agencia/` | Instructions do workspace (padrão Mestre) e duas Skills do Lovable (`/lp-brief`, `/revisao-lp`) |

---

## Checklist antes da aula

1. **Abrir o deck** e passar por ele com as notas abertas (N). Siga `02-guia-da-apresentacao.md`.
2. **Preencher o nome** na capa: procure "[Seu nome]" em `apresentacao/index.html`.
3. **Criar o Gem** (10 min) com `05-material-pos-aula/assistente-brief/como-instalar-e-usar.md`. Rode os 4 casos de teste e coloque o link no slide 29 (procure "Link do Gem").
4. **Ensaiar uma vez cronometrando:** chegar no slide 18 até 16:00. Se apertar, pule os slides 17, 30 e 26.
5. **Deixar a LP da Vingô aberta numa aba** para o slide 20.
6. **(Opcional, 20 min)** Rodar o prompt completo no Lovable com o brandbook anexado (`03-exemplo-vingo-prompts.md`, seção 6) para ter também um resultado 100% Lovable da Vingô.

Se mudar textos do deck, mantenha as regras da Mestre: título termina com ponto, sem travessão, Outfit, tinta e papel.

---

## Mensagem pronta para o grupo (pós-aula)

> Pessoal, obrigado pela aula! Aqui está o material:
> 📌 **Guia de bolso BRIEF**: a fórmula, o modelo de prompt, as palavras que destravam o uau e os pedidos de ajuste → [anexar guia]
> 🤖 **Assistente BRIEF no Gemini**: cole o briefing do cliente e receba o prompt pronto para o Lovable → [link do Gem]
> 🤖 **Versão Claude** (Skill): Configurações → Capabilities → Skills → enviar o arquivo → [anexar brief-lovable.zip]
> 💡 Desafio: na próxima LP, testem o BRIEF e mandem o antes e depois aqui!
> Prompt bom é briefing bom.

---

## Decisões tomadas (e por quê)

- **A aula virou um guia de boas práticas.** Doze práticas de prompt, cada uma com um exemplo de prompt fraco e de prompt forte, e oito dicas de Lovable, uma por slide. O "BRIEF" aparece como esqueleto de prompt, sem tomar o centro: o recado é que o briefing precisa ir inteiro e detalhado para o prompt.
- **Fio da história:** a mesma IA fez a versão A e a versão B da Vingô. Cada prática acrescenta uma peça ao prompt (o medidor no rodapé dos slides mostra o prompt crescendo) até ele virar o briefing completo, mostrado na íntegra, que gerou a versão B.
- **Sem slides de frase de impacto.** Toda tela tem conteúdo para falar.
- **O fator uau é "permissão + direção + coerência":** vários momentos de movimento funcionam quando todos nascem da marca. Efeito genérico repetido em toda seção é cara de IA.
- **A LP da Vingô é cinematográfica de verdade:** 3D em WebGL (Three.js), GSAP ScrollTrigger e Lenis, com versão estática para "reduzir movimento".
- **O deck segue o design system da Mestre:** tinta e papel, Outfit de 300 a 900, raio zero, sem sombra. Prints, vídeos e demos levam a cor.
- **Marca fictícia "Vingô":** o primeiro nome, "Brota", coincidia com uma empresa real do mesmo ramo.
