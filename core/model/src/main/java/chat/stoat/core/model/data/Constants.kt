package chat.stoat.core.model.data

// Enderecos do Callju.
//
// O app original aponta para a instancia oficial do Stoat. Como o Callju e uma
// instancia propria, tudo passa pelo mesmo dominio: o Caddy la na frente
// distribui cada caminho para o servico certo, entao nao existe subdominio
// separado para arquivos, eventos ou proxy como no Stoat oficial.

const val STOAT_BASE = "https://callju.online/api"
const val STOAT_SUPPORT = "https://callju.online"
const val STOAT_MARKETING = "https://callju.online"
const val STOAT_FILES = "https://callju.online/autumn"
const val STOAT_PROXY = "https://callju.online/january"
const val STOAT_WEB_APP = "https://callju.online"
const val STOAT_BETA_WEB_APP = "https://callju.online"
const val STOAT_INVITES = "https://callju.online"
const val STOAT_WEBSOCKET = "wss://callju.online/ws"
const val STOAT_CHANGELOG = "https://callju.online"
