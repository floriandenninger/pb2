package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astj extends aonm implements aooz {
    private static volatile aopf R;
    public static final astj a;
    public aony A;
    public boolean B;
    public boolean C;
    public aony D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f114J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    private int S;
    private int T;
    private int U;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public boolean z;

    static {
        astj astjVar = new astj();
        a = astjVar;
        aonm.registerDefaultInstance(astj.class, astjVar);
    }

    private astj() {
        emptyIntList();
        this.A = aonm.emptyProtobufList();
        this.D = aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001*\u0000\u0003\u0006\\*\u0000\u0002\u0000\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\u0011ဌ\u0010\u0012င\t\u0013ဇ\u0011\u0014ဇ\u0013\u0019ဇ\u0018\u001aဇ\u0019\u001dဇ\u001c\u001eဇ\u001d\u001fဇ\u001e ဇ !င!\"င\"#င#$င$%င%&ဇ&'င1(ခ2,ဇ51\u001a7ဇ;8င\u001f?ဇ@A\u001aCဇEEင0NငIQဇJRဇKSဇMUငOVငPWဇLXဇQYဇRZဇS[ဇT\\ဇU", new Object[]{"S", "T", "U", "b", "c", "d", "e", "g", assi.j, "f", "h", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z", "A", "B", "o", "C", "D", "E", "w", "F", "G", "H", "J", "K", "L", "I", "M", "N", "O", "P", "Q"});
            case NEW_MUTABLE_INSTANCE:
                return new astj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = R;
                if (aopfVar == null) {
                    synchronized (astj.class) {
                        aopfVar = R;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            R = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
