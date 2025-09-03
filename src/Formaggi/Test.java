package Formaggi;

public class Test {
    static int passedTests = 0, failedTests = 0;


    public long createData(String anno, String mese, String giorno) {
        return Long.parseLong(anno+mese+giorno);
    }

    public static Formaggio testCreateFormaggioCorrect(int idx, String name, int seriale, long dataDiProduzione) {
        try {
            return new Formaggio(name, seriale, dataDiProduzione);
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static boolean testEquals(int idx, Formaggio p1, Formaggio p2, boolean expected) {
        try {
            return (p1.equals(p2)==expected);
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static Grotta testCreateGrottaCorrect(int idx, String name, int size) {
        try {
            return new Grotta(name, size);
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static boolean testCreateGrottaInorrect(int idx, String name, int size) {
        try {
            Grotta g = new Grotta(name, size);
            System.err.println("ERRORE TEST "+idx);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean testCreateFormaggioIncorrect(int idx, String name, int seriale, long dataDiProduzione) {
        try {
            Formaggio f = new Formaggio(name, seriale, dataDiProduzione);
            System.err.println("ERRORE TEST "+idx);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean testSetStagionatura(int idx, Formaggio f, long data, boolean exp) {
        try {
            boolean res = f.stagionato(data);
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testGetStagionatura(int idx, Formaggio p, long exp) {
        try {
            long res = p.getDataDiFineStagionatura();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testGetProduzione(int idx, Formaggio p, long exp) {
        try {
            long res = p.getDataDiProduzione();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testGetSeriale(int idx, Formaggio p, long data, int exp) {
        try {
            int res = p.getSeriale();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testAggiungiFormaggio(int idx, Grotta g, Formaggio f, boolean exp) {
        try {
            boolean res = g.aggiungiFormaggio(f);
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testStagionaturaMedia(int idx, Grotta g, double exp) {
        try {
            double res = g.stagionaturaMedia();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testFormaggiAnno(int idx, Grotta g, int anno, int exp) {
        try {
            int res = g.prodotti(anno);
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testFormaggiStagionati(int idx, Grotta g, int exp) {
        try {
            int res = g.stagionati();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static boolean testMediaStagionatura(int idx, Grotta g, double exp) {
        try {
            double res = g.stagionaturaMedia();
            if (res != exp) {
                System.err.println("ERRORE TEST "+idx+": atteso "+exp+" prodotto "+res);
                return false;
            }
            return true;
        } catch (Exception e) {
            System.err.println("ERRORE TEST "+idx);
            System.err.println(e.getMessage());
            return false;
        }
    }



    public static void main(String[] args) {
        int idx = 1;
        Grotta g = testCreateGrottaCorrect(idx++, "Grotta", 10);
        test(g != null);
        test(testCreateGrottaCorrect(idx++, "Grotta", 0)!=null);
        test(testCreateGrottaInorrect(idx++, "Grotta", -1));
        test(testCreateGrottaInorrect(idx++, null, 10));
        test(testCreateGrottaInorrect(idx++, "G", 10));
        Formaggio f1 = testCreateFormaggioCorrect(idx++, "F1", 1, 20230101);
        test(f1 != null);
        Formaggio f2 = testCreateFormaggioCorrect(idx++, "F2", 2, 20240101);
        test(f2 != null);
        Formaggio f3 = testCreateFormaggioCorrect(idx++, "F3", 3, 20240101);
        test(f3 != null);
        Formaggio f4 = testCreateFormaggioCorrect(idx++, "F3", 3, 20240101);
        test(f4 != null);
        test(testEquals(idx++, f1, f2, false));
        test(testEquals(idx++, f1, f1, true));
        test(testEquals(idx++, f3, f4, true));
        test(testEquals(idx++, f2, f3, false));
        test(testEquals(idx++, f2, null, true));
        test(testCreateFormaggioIncorrect(idx++, "F1", -1, 20240612));
        test(testCreateFormaggioIncorrect(idx++, "F", 1, 20240612));
        test(testCreateFormaggioIncorrect(idx++, null, 1, 20240612));
        test(testCreateFormaggioIncorrect(idx++, "F1", 1, 99999999));
        test(testCreateFormaggioIncorrect(idx++, "F1", 1, 18000101));
        test(testCreateFormaggioIncorrect(idx++, "F1", 1, 19001301));
        test(testCreateFormaggioIncorrect(idx++, "F1", 1, 19001232));
        test(testCreateFormaggioIncorrect(idx++, "F1", 1, 12));
        test(testGetProduzione(idx++, f1, 20230101));
        test(testGetStagionatura(idx++, f1, 0));
        test(testSetStagionatura(idx++,f1, 20220612, false));
        test(testSetStagionatura(idx++,f1, 20251231, true));
        test(testSetStagionatura(idx++,f2, 20251231, true));
        test(testGetStagionatura(idx++, f1, 20251231));
        test(testAggiungiFormaggio(idx++,g, f1, true));
        test(testAggiungiFormaggio(idx++,g, f2, true));
        test(testAggiungiFormaggio(idx++,g, f3, true));
        test(testAggiungiFormaggio(idx++,g, f4, false));
        test(testFormaggiAnno(idx++, g, 2024, 2));
        test(testFormaggiStagionati(idx++, g,  2));
        test(testFormaggiStagionati(idx++, g,  2));
        test(testMediaStagionatura(idx++, g, (20251231+20251231-20230101-20240101)/2.0));
        System.out.println("\n\nTEST TOTALI: "+(passedTests+failedTests)+" TEST PASSATI: "+passedTests+" TEST FALLITI: "+failedTests+"\n\n");
    }


    private static void test(boolean b) {
        if (b) passedTests++; else  failedTests++;
        System.out.println(""+(passedTests+failedTests)+". "+(b?"OK":"NO"));
    }
}