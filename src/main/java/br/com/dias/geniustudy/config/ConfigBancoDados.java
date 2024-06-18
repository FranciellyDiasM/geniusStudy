/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dias.geniustudy.config;

import br.com.dias.geniustudy.modelo.Aluno;
import br.com.dias.geniustudy.modelo.Curso;
import br.com.dias.geniustudy.modelo.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frand
 */
public abstract class ConfigBancoDados {

    public static ArrayList<Professor> getProfessoresSimples() {
        return PROFESSORES_SIMPLES;
    }

    public static ArrayList<Professor> getProfessoresCompleto() {
        return PROFESSORES_COMPLETO;
    }

    public static ArrayList<Aluno> getAlunosSimples() {
        return ALUNOS_SIMPLES;
    }

    public static ArrayList<Aluno> getAlunosCompleto() {
        return ALUNOS_COMPLETO;
    }

    private static final ArrayList<Curso> CURSOS_ALANA = new ArrayList<>(List.of(
            new Curso("Matematica", 80.0, "14:00"),
            new Curso("Fisica", 85.0, "10:00"),
            new Curso("Engenharia de Requisitos", 100.0, "09:00")
    ));
    private static final Professor ALANA = new Professor("ALANA RODRIGUES ROCHA", "alana.rocha@LPOOtutorFaesa.com.br", "alana123", CURSOS_ALANA);

    private static final ArrayList<Curso> CURSOS_ANA = new ArrayList<>(List.of(
            new Curso("Ingles", 75.0, "09:00"),
            new Curso("Design", 120.0, "17:30"),
            new Curso("Inteligencia Artifial", 130.0, "18:30")
    ));
    private static final Professor ANA = new Professor("ANA KESIA SANTOS", "ana.santos@LPOOtutorFaesa.com.br", "ana123", CURSOS_ANA);

    private static final ArrayList<Curso> CURSOS_FRANCIELLY = new ArrayList<>(List.of(
            new Curso("Historia", 80.0, "10:00"),
            new Curso("Geografia", 70.0, "14:00"),
            new Curso("Historia", 80.0, "15:00")
    ));
    private static final Professor FRANCIELLY = new Professor("FRANCIELLY DIAS MACEDO", "francielly.macedo@LPOOtutorFaesa.com.br", "fran123", CURSOS_FRANCIELLY);

    private static final ArrayList<Curso> CURSOS_JUAN = new ArrayList<>(List.of(
            new Curso("Biologia", 80.0, "14:00"),
            new Curso("Quimica", 85.0, "10:00"),
            new Curso("Analise OO", 90.0, "09:00"),
            new Curso("Seguranca Cibernetica", 590.0, "15:00")
    ));
    private static final Professor JUAN = new Professor("JUAN TAVARES MARCOLINO LIRIO", "juan.lirio@LPOOtutorFaesa.com.br", "juan123", CURSOS_JUAN);

    private static final ArrayList<Curso> CURSOS_LUCAS = new ArrayList<>(List.of(
            new Curso("Fisica", 85.0, "13:00"),
            new Curso("Matematica", 80.0, "09:00"),
            new Curso("Engenharia de Software", 95.0, "12:00"),
            new Curso("Forro/Samba", 430.0, "19:00"),
            new Curso("QA-Resolução de conflitos", 260.0, "15:30")
    ));
    private static final Professor LUCAS = new Professor("LUCAS LIMA FERRARI", "lucas.ferrari@LPOOtutorFaesa.com.br", "lucas123", CURSOS_LUCAS);

    private static final ArrayList<Curso> CURSOS_PATRICK = new ArrayList<>(List.of(
            new Curso("Ingles", 75.0, "10:00"),
            new Curso("Portugues", 70.0, "14:00"),
            new Curso("Sistemas Operacionais", 100.0, "08:00"),
            new Curso("Palestrante Couch", 210.0, "19:30"),
            new Curso("Criar Manual de Usuario", 45.0, "16:30")
    ));
    private static final Professor PATRICK = new Professor("PATRICK COSTA ROSA TORREZANI", "patrick.torrezani@LPOOtutorFaesa.com.br", "patrick123", CURSOS_PATRICK);

    private static final ArrayList<Curso> CURSOS_YURI = new ArrayList<>(List.of(
            new Curso("Geografia", 70.0, "09:00"),
            new Curso("Historia", 80.0, "13:00"),
            new Curso("Portugues", 85.0, "15:00"),
            new Curso("Influencer Body Builder", 290.0, "12:30"),
            new Curso("Cadastro de Professores", 80.0, "19:00")
    ));
    private static final Professor YURI = new Professor("YURI SMARSARO AMORIM", "yuri.amorim@LPOOtutorFaesa.com.br", "yuri123", CURSOS_YURI);

    private static final ArrayList<Curso> CURSOS_NICHOLE = new ArrayList<>(List.of(
            new Curso("Filosofia", 100.0, "17:00"),
            new Curso("Eletromagnetismo", 80.0, "08:00"),
            new Curso("Fisica Quantica", 110.0, "19:00"),
            new Curso("Dancinha do Tik Tok", 350.0, "15:30"),
            new Curso("Requisitos Funcionais", 60.0, "11:00")
    ));
    private static final Professor NICHOLE = new Professor("NICHOLE DA SILVA NICOLINI", "nchnicolini@gmail.com", "nichole123", CURSOS_NICHOLE);

    private static final ArrayList<Professor> PROFESSORES_COMPLETO = new ArrayList<>(List.of(
            ALANA,
            ANA,
            FRANCIELLY,
            JUAN,
            LUCAS,
            PATRICK,
            YURI,
            NICHOLE
    ));

    private static final ArrayList<Curso> CURSOS_JOAO = new ArrayList<>(List.of(
            new Curso("LP01", 200.0, "09:00"),
            new Curso("LP02", 225.0, "11:00"),
            new Curso("LPOO", 275.0, "14:30")
    ));
    private static final Professor JOAO = new Professor("joao", "joao@", "123", CURSOS_JOAO);

    private static final ArrayList<Curso> CURSOS_JOSE = new ArrayList<>(List.of(
            new Curso("Alpinismo", 250.0, "08:30"),
            new Curso("Paraquedismo", 300.0, "13:00"),
            new Curso("skate", 100.0, "17:30")
    ));
    private static final Professor JOSE = new Professor("jose", "jose@", "123", CURSOS_JOSE);

    private static final ArrayList<Curso> CURSOS_MARIA = new ArrayList<>(List.of(
            new Curso("Java", 150.0, "09:30"),
            new Curso("kotlin", 175.0, "10:00"),
            new Curso("pyhton", 125.0, "15:00"),
            new Curso("Go", 225.0, "16:00")
    ));
    private static final Professor MARIA = new Professor("maria", "maria@", "123", CURSOS_MARIA);

    private static final ArrayList<Professor> PROFESSORES_SIMPLES = new ArrayList<>(List.of(
            JOAO,
            JOSE,
            MARIA
    ));

    /// *************** ALUNOS *****************  ///
    private static final Aluno ANA_KARLA = new Aluno("ANA KARLA VIANNA TACON", "ana.tacon@LPOOFaesa.com.br", "9f8s7g6h");
    private static final Aluno ANGELO = new Aluno("ANGELO VICTOR PEREIRA PRIORI", "angelo.priori@LPOOFaesa.com.br", "4d3c2b1a");
    private static final Aluno CATHARINA = new Aluno("CATHARINA ALVES BONELLA", "catharina.bonella@LPOOFaesa.com.br", "r5t6y7u8");
    private static final Aluno CAUA = new Aluno("CAUÃ RODRIGUES RABELLO", "caua.rabello@LPOOFaesa.com.br", "i9o0p1a2");
    private static final Aluno EMANUEL = new Aluno("EMANUEL SIQUEIRA LANNES", "emanuel.lannes@LPOOFaesa.com.br", "s3d4f5g6");
    private static final Aluno FERNANDO = new Aluno("FERNANDO BICALHO ALMEIDA", "fernando.almeida@LPOOFaesa.com.br", "h7j8k9l0");
    private static final Aluno GABRIEL = new Aluno("GABRIEL SALOMÃO PANCIONE", "gabriel.pancione@LPOOFaesa.com.br", "z1x2c3v4");
    private static final Aluno JOAO_ANTONIO = new Aluno("JOÃO ANTONIO CARNEIRO VASCONCELOS", "joao.vasconcelos@LPOOFaesa.com.br", "b5n6m7o8");
    private static final Aluno JOAO_GUILHERME = new Aluno("JOÃO GUILHERME CRISTINO HEIDMANN", "joao.heidmann@LPOOFaesa.com.br", "p9q0w1e2");
    private static final Aluno JOAO_VICTOR = new Aluno("JOÃO VICTOR TRARBACH DOS SANTOS", "joao.santos@LPOOFaesa.com.br", "r3t4y5u6");
    private static final Aluno JONATAS = new Aluno("JONATAS DOS REIS RIBEIRO", "jonatas.ribeiro@LPOOFaesa.com.br", "i7o8p9a0");
    private static final Aluno JULIO = new Aluno("JÚLIO CÉSAR SEPULCRI GHESSO", "julio.ghesso@LPOOFaesa.com.br", "s1d2f3g4");
    private static final Aluno KAYKE = new Aluno("KAYKE RIOS DE PAULA", "kayke.paula@LPOOFaesa.com.br", "h5j6k7l8");
    private static final Aluno LUCAS_CARDOSO = new Aluno("LUCAS CARDOSO PEIXOTO FONTOURA", "lucas.fontoura@LPOOFaesa.com.br", "z9x0c1v2");
    private static final Aluno LUCIANO = new Aluno("LUCIANO DA SILVA PAIVA", "luciano.paiva@LPOOFaesa.com.br", "b3n4m5o6");
    private static final Aluno LUIS = new Aluno("LUIS GUSTAVO ZANONI BERMUDES", "luis.bermudes@LPOOFaesa.com.br", "p7q8w9e0");
    private static final Aluno LUIZ = new Aluno("LUIZ GUSTAVO DOMINISINI", "luiz.dominisini@LPOOFaesa.com.br", "r1t2y3u4");
    private static final Aluno MARCELO = new Aluno("MARCELO FAITANIN MACHADO", "marcelo.machado@LPOOFaesa.com.br", "i5o6p7a8");
    private static final Aluno MATEUS = new Aluno("MATEUS CARDOSO PEIXOTO FONTOURA", "mateus.fontoura@LPOOFaesa.com.br", "s9d0f1g2");
    private static final Aluno NICHOLE_SILVA = new Aluno("NICHOLE DA SILVA NICOLINI", "nichole.nicolini@LPOOFaesa.com.br", "h3j4k5l6");
    private static final Aluno PAULO = new Aluno("PAULO HUGO ROTHECHEDL CAVALIERI", "paulo.cavalieri@LPOOFaesa.com.br", "z7x8c9v0");
    private static final Aluno RAYSSA = new Aluno("RAYSSA NASCIMENTO PAIXÃO KOEHLER", "rayssa.koehler@LPOOFaesa.com.br", "b1n2m3o4");
    private static final Aluno THARLES = new Aluno("THARLES CASSIANO RODRIGUES SOARES", "tharles.soares@LPOOFaesa.com.br", "p5q6w7e8");

    private static final ArrayList<Aluno> ALUNOS_COMPLETO = new ArrayList<>(List.of(
            ANA_KARLA,
            ANGELO,
            CATHARINA,
            CAUA,
            EMANUEL,
            FERNANDO,
            GABRIEL,
            JOAO_ANTONIO,
            JOAO_GUILHERME,
            JOAO_VICTOR,
            JONATAS,
            JULIO,
            KAYKE,
            LUCAS_CARDOSO,
            LUCIANO,
            LUIS,
            LUIZ,
            MARCELO,
            MATEUS,
            NICHOLE_SILVA,
            PAULO,
            RAYSSA,
            THARLES
    ));
    
    private static final Aluno ZEZE = new Aluno("Zeze", "zeze@", "123");
    private static final Aluno ZEZINHO = new Aluno("Zezinho@", "zezinho", "123");
    private static final Aluno ZECA = new Aluno("Zeca", "zeca@", "123");
    
     private static final ArrayList<Aluno> ALUNOS_SIMPLES = new ArrayList<>(List.of(
             ZEZE,
             ZEZINHO,
             ZECA
     ));
    
}
