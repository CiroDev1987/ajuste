import java.util.ArrayList;

class Ciro {

    public static void main(String[] args) {

        String[] financiamento = {
                "T.MERCADO - MATERIAL DE CONSTRUCAO                          ",
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-NOVO                      ",
                "PROCAP - AQUISICAO TERRENO - Prejuízo                       ",
                "T.MERCADO - IMOVEIS COMERCIAIS                              ",
                "T.MERCADO - IMOVEIS RESID - USADO - Com Atraso              ",
                "T.MERCADO - CONSTRUCAO CONCLUIDA - Com Atraso               ",
                "T.MERCADO - CONSTRUCAO CONCLUIDA - Prejuízo                 ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO - Com Atraso       ",
                "PEM - IMOVEIS RESID - NOVO - Prejuízo                       ",
                "PROCAP-FAIXA I-SFH-CONSTRUÇÃO CONCLUIDA - Prejuízo          ",
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS             ",
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-USADO                     ",
                "SFH - IMOVEIS RESID. - USADO                                ",
                "SFH - CONSTRUCAO CONCLUIDA - Com Atraso                     ",
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB - Com Atraso       ",
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED.                          ",
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED. - Prejuízo               ",
                "SFH - IMOVEIS RESID. - NOVO                                 ",
                "SFH - CONSTRUCAO CONCLUIDA - Prejuízo                       ",
                "T.MERCADO - IMOVEIS RESID - NOVO                            ",
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-NOVO - Com Atraso         ",
                "SFH - MAT.CONSTRUCAO - AQUIS.CRED. - Com Atraso             ",
                "FX LIVRE - AQUISICAO TERRENO - Prejuízo                     ",
                "FX LIVRE - EMPREST GAR. HIPOTECARIA - Prejuízo              ",
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB                    ",
                "T.MERCADO - IMOVEIS COMERCIAIS - Com Atraso                 ",
                "PROCAP-FAIXA I-SFH-CONSTRUÇÃO CONCLUIDA                     ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO - Prejuízo          ",
                "PROCAP-FAIXA II-SFH - CONTRUCAO CONCLUIDA - Com Atraso      ",
                "T.MERCADO - MATERIAL DE CONSTRUCAO - Prejuízo               ",
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO                           ",
                "T.MERCADO - IMOVEIS RESID - USADO                           ",
                "PROCAP-AQUISICAO DE TERRENO - FAIXA LIVRE                   ",
                "PEM - IMOVEIS RESID - USADO - Prejuízo                      ",
                "PROCAP-FAIXA III -T. MERCADO-IMOVEIS RESID – NOVO - Com Atra",
                "PEM - IMOVEIS RESID - USADO - Com Atraso                    ",
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO Com Atraso                ",
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA - Com Atraso            ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO - Com Atraso        ",
                "FX LIVRE - AQUISICAO TERRENO                                ",
                "SFH - IMOVEIS RESID. - NOVO - Prejuízo                      ",
                "PROCAP-FAIXA II-SFH - CONTRUCAO CONCLUIDA                   ",
                "SFH - IMOVEIS RESID. - USADO - Com Atraso                   ",
                "SFH - IMOVEIS RESID. - USADO - Prejuízo                     ",
                "T.MERCADO - CONSTRUCAO CONCLUIDA                            ",
                "PEM - CONSTRUCAO CONCLUIDA                                  ",
                "EMPRESTIMOS - CAPITAL DE GIRO - Prejuízo                    ",
                "T.MERCADO - MAT DE CONSTRUCAO - GAR IMOB - Prejuízo         ",
                "PROCAP-FAIXA III -T. MERCADO-CONTRUCAO CONCLUÍDA            ",
                "TM - M.CONSTRUCAO - AQUIS.CRÉDITO - Prejuízo                ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - NOVO                     ",
                "PROCAP-FX ESPECIAL-SFH-IMÓVEL RESID                         ",
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS - PREJUIZO  ",
                "SFH - CONSTRUCAO CONCLUIDA                                  ",
                "T.MERCADO - IMOVEIS RESID - NOVO - Prejuízo                 ",
                "SFH - IMOVEIS RESID. - NOVO - Com Atraso                    ",
                "PROCAP-FAIXA III -T. MERCADO-IMOVEIS RESID – NOVO           ",
                "T.MERCADO - MATERIAL DE CONSTRUCAO - Com Atraso             ",
                "PEM - AQUISICAO DE TERRENO                                  ",
                "T.MERCADO - IMOVEIS RESID - NOVO - Com Atraso               ",
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA                         ",
                "PROCAP-FX ESPECIAL-SFH-IMÓVEL RESID - Com Atraso            ",
                "PEM - IMOVEIS RESID - USADO                                 ",
                "T.MERCADO - IMOVEIS RESID - USADO - Prejuízo                ",
                "PEM - IMOVEIS RESID - NOVO                                  ",
                "T.MERCADO - MATERIAL DE CONSTRUCAO - LINHA MAIS - COM ATRASO",
                "PROCAP-FAIXA II-SFH-IMOVEIS RESID-USADO - Com Atraso        ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO                    ",
                "FX LIVRE - EMPREST. GAR. FIDUCIARIA - Prejuízo              ",
                "FX LIVRE - AQUISICAO TERRENO - Com Atraso                   ",
                "PEM - AQUISICAO DE TERRENO - Com Atraso                     ",
                "PROCAP-FAIXA I-SFH-IMOVEIS RESID - USADO - Prejuízo         ",
                "Ciro - Com Atraso"
        };

        for (int i = 0; i < financiamento.length; i++) {
            financiamento[i] = Ciro.ajustar(financiamento[i]);
            System.out.println(Ciro.ajustar(financiamento[i]));
        }
    }

    public static String ajustar(String descricao) {
        return descricao
                .replace("- Com Atraso", "")
                .replace("- Com atraso", "")
                .replace("- com atraso", "")
                .replace("- COM ATRASO", "")
                .replace("- Com Atra", "")
                .replace("- Prejuizo", "")
                .replace("- Prejuízo", "")
                .replace("- PREJUIZO", "")
                .replace("- PREJUÍZO", "")
                .replace(" Com Atraso", "")
                .replace(" Com atraso", "")
                .replace(" com atraso", "")
                .replace(" COM ATRASO", "")
                .replace(" Prejuizo", "")
                .replace(" Prejuízo", "")
                .replace(" PREJUIZO", "")
                .replace(" PREJUÍZO", "");
    }


}

