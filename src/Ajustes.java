import java.util.ArrayList;

class Ciro {

    public static void main(String[] args) {

        String financiamento = "T.MERCADO - MATERIAL DE CONSTRUCAO                          \n" +
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-NOVO                      \n" +
                "                                                            \n" +
                "PROCAP - AQUISICAO TERRENO - Prejuízo                       \n" +
                "T.MERCADO - IMOVEIS COMERCIAIS                              \n" +
                "T.MERCADO - IMOVEIS RESID - USADO - Com Atraso              \n" +
                "T.MERCADO - CONSTRUCAO CONCLUIDA - Com Atraso               \n" +
                "T.MERCADO - CONSTRUCAO CONCLUIDA - Prejuízo                 \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO - Com Atraso       \n" +
                "PEM - IMOVEIS RESID - NOVO - Prejuízo                       \n" +
                "PROCAP-FAIXA I-SFH-CONSTRUÇÃO CONCLUIDA - Prejuízo          \n" +
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS             \n" +
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-USADO                     \n" +
                "SFH - IMOVEIS RESID. - USADO                                \n" +
                "SFH - CONSTRUCAO CONCLUIDA - Com Atraso                     \n" +
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB - Com Atraso       \n" +
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED.                          \n" +
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED. - Prejuízo               \n" +
                "SFH - IMOVEIS RESID. - NOVO                                 \n" +
                "SFH - CONSTRUCAO CONCLUIDA - Prejuízo                       \n" +
                "T.MERCADO - IMOVEIS RESID - NOVO                            \n" +
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-NOVO - Com Atraso         \n" +
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED. - Com Atraso             \n" +
                "FX LIVRE - AQUISICAO TERRENO - Prejuízo                     \n" +
                "FX LIVRE - EMPREST GAR. HIPOTECARIA - Prejuízo              \n" +
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB                    \n" +
                "T.MERCADO - IMOVEIS COMERCIAIS - Com Atraso                 \n" +
                "PROCAP-FAIXA I-SFH-CONSTRUÇÃO CONCLUIDA                     \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO - Prejuízo          \n" +
                "PROCAP-FAIXA II-SFH - CONTRUCAO CONCLUIDA - Com Atraso      \n" +
                "T.MERCADO - MATERIAL DE CONSTRUCAO - Prejuízo               \n" +
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO                           \n" +
                "T.MERCADO - IMOVEIS RESID - USADO                           \n" +
                "PROCAP-AQUISICAO DE TERRENO - FAIXA LIVRE                   \n" +
                "PEM - IMOVEIS RESID - USADO - Prejuízo                      \n" +
                "PROCAP-FAIXA III -T. MERCADO-IMOVEIS RESID – NOVO - Com Atra\n" +
                "PEM - IMOVEIS RESID - USADO - Com Atraso                    \n" +
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO Com Atraso                \n" +
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA - Com Atraso            \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO - Com Atraso        \n" +
                "FX LIVRE - AQUISICAO TERRENO                                \n" +
                "SFH - IMOVEIS RESID. - NOVO - Prejuízo                      \n" +
                "PROCAP-FAIXA II-SFH - CONTRUCAO CONCLUIDA                   \n" +
                "SFH - IMOVEIS RESID. - USADO - Com Atraso                   \n" +
                "SFH - IMOVEIS RESID. - USADO - Prejuízo                     \n" +
                "T.MERCADO - CONSTRUCAO CONCLUIDA                            \n" +
                "PEM - CONSTRUCAO CONCLUIDA                                  \n" +
                "EMPRESTIMOS - CAPITAL DE GIRO - Prejuízo                    \n" +
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB - Prejuízo         \n" +
                "PROCAP-FAIXA III -T. MERCADO-CONTRUCAO CONCLUÍDA            \n" +
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO - Prejuízo                \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO                     \n" +
                "PROCAP-FX ESPECIAL-SFH-IMÓVEL RESID                         \n" +
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS - PREJUIZO  \n" +
                "SFH - CONSTRUCAO CONCLUIDA                                  \n" +
                "T.MERCADO - IMOVEIS RESID - NOVO - Prejuízo                 \n" +
                "SFH - IMOVEIS RESID. - NOVO - Com Atraso                    \n" +
                "PROCAP-FAIXA III -T. MERCADO-IMOVEIS RESID – NOVO           \n" +
                "T.MERCADO - MATERIAL DE CONSTRUCAO - Com Atraso             \n" +
                "PEM - AQUISICAO DE TERRENO                                  \n" +
                "T.MERCADO - IMOVEIS RESID - NOVO - Com Atraso               \n" +
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA                         \n" +
                "PROCAP-FX ESPECIAL-SFH-IMÓVEL RESID - Com Atraso            \n" +
                "PEM - IMOVEIS RESID - USADO                                 \n" +
                "T.MERCADO - IMOVEIS RESID - USADO - Prejuízo                \n" +
                "PEM - IMOVEIS RESID - NOVO                                  \n" +
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS - COM ATRASO\n" +
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-USADO - Com Atraso        \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO                    \n" +
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA - Prejuízo              \n" +
                "FX LIVRE - AQUISICAO TERRENO - Com Atraso                   \n" +
                "PEM - AQUISICAO DE TERRENO - Com Atraso                     \n" +
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO - Prejuízo";

        financiamento = financiamento.replace(" - Prejuízo ", "")
                .replace(" - Com Atraso", "")
                .replace(" - Com Atraso", "")
                .replace(" Com Atraso", "")
                .replace(" Com Atraso", "")
                .replace(" - Prejuízo", "")
                .replace(" - COM ATRASO", "")
                .replace(" - PREJUIZO", "");

        System.out.println(financiamento);
    }


    }

