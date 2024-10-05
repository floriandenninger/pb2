package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atax extends aonm implements aooz {
    public static final atax a;
    private static volatile aopf an;
    public int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f117J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public int aa;
    public int ab;
    public int ac;
    public boolean ad;
    public int ae;
    public int af;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public int am;
    private int ao;
    private int ap;
    private int aq;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public aony g = aonm.emptyProtobufList();
    public aonu V = emptyIntList();
    public aony ag = aonm.emptyProtobufList();

    static {
        atax ataxVar = new atax();
        a = ataxVar;
        aonm.registerDefaultInstance(atax.class, ataxVar);
    }

    private atax() {
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
                return newMessageInfo(a, "\u0001?\u0000\u0004\u0006u?\u0000\u0003\u0000\u0006ဇ\u0005\bဋ\u0006\u000eဇ\f\u0016ဇ\u0014\u0017\u001a\u0018ဋ\u0015\u001aဇ\u0017\u001cဇ\u0019\u001dဇ\u001a\u001eဇ\u001b\u001fဋ\u001c ဇ\u001d!ဋ\u001e\"ဇ\u001f%ဇ\"(ဇ%)ဇ&*ဇ'/ဇ,0ဇ-1ဇ.3ဇ04ဇ17ဇ4=ဋ:>ဇ;?ဇ<Aခ>Bခ?Cဇ@EဇBGဇDPဇMQဇNRဋOSဋPUဋRWဇTYဋVZဋW[ဋX\\ဋY]ဋZ^ဋ[_ဋ\\`\u001daဋ]bဋ^cဋ_dဇ`eဋafဋbgဌciဇejဋfkဋgl\u001amဇhnဇioဇjrဇmtဇouဋp", new Object[]{"b", "ao", "ap", "aq", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", atbk.i, "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am"});
            case NEW_MUTABLE_INSTANCE:
                return new atax();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = an;
                if (aopfVar == null) {
                    synchronized (atax.class) {
                        aopfVar = an;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            an = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
