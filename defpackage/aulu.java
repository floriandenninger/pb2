package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulu extends aonm implements aooz {
    private static volatile aopf Z;
    public static final aulu a;
    public boolean A;
    public boolean B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public aulr H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f125J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public float Q;
    public String R;
    public boolean S;
    public float T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public boolean Y;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public String h;
    public boolean i;
    public String j;
    public ault k;
    public boolean l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        aulu auluVar = new aulu();
        a = auluVar;
        aonm.registerDefaultInstance(aulu.class, auluVar);
    }

    private aulu() {
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        this.h = "";
        this.j = "";
        this.m = "";
        this.R = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001-\u0000\u0005\u0012\u009d-\u0000\u0000\u0000\u0012ခ\n\u0016ဈ\u000e,ဇ\u001d/ဈ\u001f6ဉ$Dဇ2Eဈ3Fဇ4Lဇ9Mဇ:Oင;Pဇ<Rဇ>Tဇ?XဇD^ဇI`ဇKbဇMkဇVlဇWnဇXrခ\\tဇ^vဇ`wဇayဇc|ဇ@\u0080ဉi\u0081ဇj\u0082ဋk\u0087ဇp\u0088ဇq\u008bဇt\u008fဇx\u0090ငy\u0091ဇz\u0092ခ{\u0093ဈ|\u0094ဇ}\u0096ခ~\u0097ဇ\u007f\u0098ဇ\u0080\u0099င\u0081\u009cဇ\u0084\u009dဇ\u0085", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "u", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"});
            case NEW_MUTABLE_INSTANCE:
                return new aulu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = Z;
                if (aopfVar == null) {
                    synchronized (aulu.class) {
                        aopfVar = Z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            Z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
