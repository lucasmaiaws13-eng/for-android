# 05 — Possíveis dúvidas (com respostas)

> Respostas para o apresentador. As marcadas com **[slide N]** têm slide extra no deck (slides 29 a 37, ver `02-guia-da-apresentacao.md`).
> Informações do Lovable conferidas na documentação oficial em nov/2026. O produto muda rápido: se algo estiver diferente na tela, a lógica continua valendo.

---

## Sobre o método

**"Prompt grande não confunde a IA?"**
O que confunde é prompt **bagunçado**, não comprido. Um briefing de uma página organizado em blocos (BRIEF) funciona muito bem, e as próprias documentações de Lovable, OpenAI e Anthropic recomendam dar contexto, conteúdo real e direção visual. O que não funciona é pedir 10 mudanças diferentes num ajuste: aí sim, um assunto por mensagem.

**"Preciso escrever tudo isso toda vez?"**
Não. Use o Assistente BRIEF (Gem/Skill): você cola o briefing do cliente e ele monta o prompt. E o que é fixo do cliente vai para as *Instructions* do projeto no Lovable, então os próximos pedidos podem ser curtos.

**"Escrevo em português ou inglês?" [slide 29]**
Português. O Lovable entende muito bem e a página sai em português. Mantenha em inglês os termos de design que não têm tradução consagrada (*parallax, hover, glassmorphism, sticky scroll, bento grid*): são os "nomes dos ingredientes" que a IA reconhece.

**"Começar com 'você é um designer sênior' ajuda?"**
Pouco. Um estudo da Wharton (dez/2025) testou personas de especialista em 6 modelos e não encontrou ganho de precisão. Pode ajudar no tom, mas o que muda o resultado é o contexto do cliente. Uma linha de papel não atrapalha; só não gaste o prompt nisso.

**"Funciona fora do Lovable?"**
Sim. BRIEF é um método de briefing: funciona no v0, Bolt, Claude, ChatGPT, Gemini Canvas, e até para pedir uma peça a um designer humano.

**"A IA gera sempre igual com o mesmo prompt?"**
Não, há variação a cada geração. Por isso: marque as versões boas no histórico do Lovable e, se quiser opções, peça *"descreva três direções para o hero antes de construir"* ou gere duas vezes e escolha.

**"A IA vai substituir o designer?"**
O método mostra o contrário: o resultado bom vem de **decisões de direção** (marca, público, hierarquia, o momento uau), que é trabalho de designer e de estrategista. A IA executa rápido. Para designers, o Lovable vira uma ferramenta de protótipo e produção; para quem não é designer, o BRIEF é um jeito de "pensar como designer" antes de pedir.

---

## Sobre o Lovable

**"Isso demora mais?" [slide 25]**
No começo, um pouco, como qualquer ferramenta nova. Com prática, o prompt sai em minutos, e o agente de prompt (lucasmaiadesign.com/paginas-com-ia) monta o prompt a partir do briefing colado. O tempo que se gasta no prompt volta em menos rodadas de correção.

**"Isso não gasta muito crédito?" [slide 20]**
- **Plan mode:** 1 crédito por mensagem (mais a pesquisa, se ele precisar investigar o projeto). Não mexe no código.
- **Build mode:** cobra pelo trabalho feito. Pedidos pequenos custam menos, gerações grandes e com imagem custam mais.
- **Chat mode:** o mais barato para tirar dúvidas, coberto pela franquia diária de chat.
- **O que mais economiza:** um prompt BRIEF bem feito no começo (evita as 10 mensagens de "não é bem isso"), ajustes por seção e várias mudanças pequenas numa lista, numa mensagem só. Dá para ver o custo de cada resposta em *More options → Credits used*.

**"Plan mode, Build mode, Chat mode: qual a diferença?"**
- **Chat:** conversar e tirar dúvidas sobre o projeto, sem plano e sem código.
- **Plan:** o Lovable investiga, faz perguntas e escreve um plano que você edita e aprova. Bom para o primeiro prompt de uma LP grande ou mudanças arriscadas.
- **Build:** executa as mudanças no projeto.

**"Por que às vezes o Lovable me faz perguntas de cor, fonte e layout antes de criar?"**
São as *design questions*: quando o prompt deixa o visual em aberto, ele pergunta paleta, tipografia e layout com amostras visuais. Se o prompt já define o visual (bloco I), ele pula as perguntas e constrói direto. Se você clicar em "Skip all", ele usa padrões… que é como nasce a cara de IA.

**"Posso usar o site do cliente como base? E o site de um concorrente?" [slide 32]**
O Lovable importa um site pela URL (lê textos, imagens, fontes, cores e layout) e cria um projeto editável. A documentação é clara: é para **sites que você possui** (no nosso caso, do cliente, com autorização). Site de concorrente ou referência de terceiros: tire print e use como **inspiração** ("use como referência de ritmo e espaçamento, não copie"), nunca como cópia.

**"Como mando o brandbook, o Figma, as referências?"**
Pelo chat do Lovable: anexe até 10 arquivos por mensagem (PDF, imagens, Word, PowerPoint e até arquivo .fig do Figma). Dá para desenhar por cima de um print anexado para mostrar o que mudar. Sempre repita no texto o que é inegociável (HEX, fontes): o anexo ajuda, o texto manda.

**"E quando o Lovable erra ou quebra algo?" [slide 24]**
1. Volte para uma versão boa no **histórico** (por isso, marque versões boas).
2. Use o *Try to fix* no máximo 2 vezes.
3. Se não resolver: Plan mode + *"Investigue a causa raiz antes de alterar qualquer código e me explique o que encontrou."*
4. Se algo que funcionava parou: *"Isso funcionava antes. Revise as mudanças recentes, descubra qual quebrou e explique antes de corrigir."*

**"Dá para mudar um detalhe sem reescrever o prompt?"**
Sim: no preview, use *Select elements* (seleciona o elemento e descreve a mudança), *Edit text inline* (edita o texto direto) ou *Draw* (rabisca por cima). Apontar é mais rápido e mais preciso que descrever.

**"O que são Instructions e Skills?" [slide 36]**
- **Instructions** (antigo *Knowledge*): uma memória fixa que vai em toda mensagem. Três níveis: workspace (regras da agência, só admins editam, até 10 mil caracteres), projeto (o cliente) e pessoal.
- **Skills:** "playbooks" sob demanda, chamados com `/` ou aplicados quando o pedido combina. Deixamos prontas a `/lp-brief` e a `/revisao-lp` (pasta `05-material-pos-aula/bonus-lovable-da-agencia/`).

**"Onde caem os leads do formulário?"**
O Lovable pode salvar os envios num banco de dados do próprio projeto (Lovable Cloud) e há conectores para ferramentas de e-mail, CRM e automação. Para campanha de verdade, combine com o time responsável pela integração (CRM, régua) e teste o envio de ponta a ponta antes de subir mídia.

**"Como integro o RD Station com a LP do Lovable?" [slide 34]**
É simples, e tem dois caminhos:
- **Recomendado, API do RD:** mantém o formulário com o visual da LP. Pegue a chave de API pública do RD Station Marketing (em Integrações) e peça ao Lovable: "Ao enviar o formulário, mande os campos para o RD Station pela API de conversões (api.rd.services/platform/conversions), com o identificador [nome-da-campanha]. Guarde a chave do RD como secret e envie pelo backend. Mostre a mensagem de sucesso só depois que o RD confirmar."
- **Mais rápido, formulário do próprio RD:** crie o formulário no RD, copie o código de incorporação e peça ao Lovable para colocá-lo no lugar do formulário. Funciona na hora, mas o visual fica o do RD.
- **Sempre:** mande um lead de teste e confira no RD se ele chegou com o identificador certo. Para rastrear visitas e a jornada do lead, peça para incluir o código de monitoramento do RD na página. Combine o identificador de conversão com quem cuida da automação.

**"E pixel, GTM, LGPD, SEO?" [slide 33]**
- **LGPD:** peça no bloco R o checkbox de consentimento e o link da política de privacidade.
- **Pixel/GTM/eventos:** dá para pedir a instalação, mas valide com quem cuida de tracking (IDs corretos, eventos de conversão, consentimento).
- **SEO:** peça título, descrição e imagem de compartilhamento; o Lovable tem revisão de SEO/AEO nativa e conexão com o Google Search Console.

**"Como publico? Dá para usar o domínio do cliente?"**
Publica-se direto do editor (ou pedindo no chat) e dá para conectar domínio próprio nas configurações do projeto. Para domínios de cliente, envolva quem administra o DNS.

**"Consigo pegar o código?"**
Sim: dá para ver e editar o código, baixar e sincronizar com GitHub/GitLab.

**"Como faço uma variação para teste A/B?"**
Duplique (*remix*) o projeto e mude só uma variável por vez (headline, hero, CTA). Assim o teste é limpo.

---

## Sobre design e performance

**"Animação não deixa a página pesada?" [slide 35]**
Pode deixar. Por isso o carimbo pede mobile-first, página rápida e respeito ao "reduzir movimento". Um momento uau bem escolhido pesa menos que dez efeitos espalhados. 3D completo (Three.js/Spline) é o mais pesado: use em produto/tech, com moderação. Teste sempre no celular. Para mídia isso importa em dinheiro: página lenta derruba conversão (o guia de tendências do Lovable cita que 53% dos usuários de celular abandonam páginas que demoram mais de 3 s).

**"E as imagens?"**
Três caminhos: (1) fotos reais do cliente (o melhor, quando são boas); (2) imagens geradas pelo próprio Lovable: descreva estilo, luz, enquadramento e peça "sem texto na imagem" (gasta créditos); (3) ilustração vetorial, ótima para marcas sem banco de fotos (como a Vingô). Evite foto de banco genérica: é outro sinal de template.

**"E se o cliente não tem brandbook?" [slide 30]**
Use o bloco I com: 3 palavras de vibe (dicionário), uma paleta de 4 a 6 cores em HEX, 2 fontes e uma referência visual (print). O Assistente BRIEF propõe isso por segmento. Depois de aprovado, salve nas Instructions do projeto: vira o "brandbook mínimo" da LP.

**"Como sei se a LP ficou boa?"**
Três testes rápidos: (1) **teste da marca:** tapa o logo, ainda é a marca? (2) **teste do scroll:** lendo só os títulos, dá para entender a oferta? (3) **teste do celular:** dá para converter com o polegar em 10 segundos? E rode a skill `/revisao-lp` antes de publicar.

**"Segmento regulado (saúde, estética, financeiro, imobiliário, jurídico)?"**
Não prometa resultado, não invente dados e sinalize para validação jurídica. Exemplos de pontos que costumam exigir atenção: registro profissional do responsável (saúde), antes/depois (conselhos profissionais), registro de incorporação e CRECI (imobiliário), CET e avisos de risco (financeiro), regras da OAB (jurídico). O Assistente BRIEF já alerta isso por segmento.

---

## Sobre os exemplos da aula

**"Essas LPs foram feitas no Lovable?"**
As duas LPs da Vingô foram montadas como demonstração fiel do que cada prompt pede, com o mesmo cliente e o mesmo briefing. O prompt está no material: rodem no Lovable e comparem (passo a passo em `03-exemplo-vingo-prompts.md`, seção 6).

**"O Lovable faz mesmo 3D e essas animações de scroll?" [slide 31]**
Faz. O Lovable instala sozinho as bibliotecas que você nomear (Three.js para 3D, GSAP com ScrollTrigger para animações ligadas ao scroll, Lenis para rolagem suave, Framer Motion). O caminho que funciona: pedir no prompt inicial com direção clara (bloco F) e depois refinar **um momento por vez** ("na seção dos números, a troca deve acontecer a cada quarto da rolagem…").

**"Não é exagero para uma LP de mídia paga?"**
Depende do objetivo. Para vitrine, lançamento, e-book, curso e marca de consumo, a experiência é o diferencial. Para campanha de conversão rápida, mantenha o hero leve, o CTA na primeira dobra e o 3D mais contido no celular. A regra é a mesma: nenhum efeito sem motivo.

**"A Vingô existe?"**
Não. É uma marca fictícia criada para a aula, com brandbook próprio, justamente para mostrar como o brandbook entra no prompt. O nome vem de planta que "vingou" (pegou e sobreviveu), e o broto do logo faz o papel do acento do "ô". Antes de escolher o nome, verificamos que não há marca de plantas conhecida chamada assim.

**"Quanto tempo leva um prompt BRIEF?"**
Com o briefing do cliente em mãos: ~10 minutos escrevendo, ou ~1 minuto com o Assistente BRIEF. A geração no Lovable leva alguns minutos. O ganho real está depois: menos rodadas de ajuste.
