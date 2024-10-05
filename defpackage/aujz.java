package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujz extends aonm implements aooz {
    private static volatile aopf N;
    public static final aujz a;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f124J;
    public boolean K;
    public boolean L;
    public boolean M;
    private int O;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
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

    static {
        aujz aujzVar = new aujz();
        a = aujzVar;
        aonm.registerDefaultInstance(aujz.class, aujzVar);
    }

    private aujz() {
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
                return newMessageInfo(a, "\u0001%\u0000\u0002\u00017%\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0005ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\u000bဇ\t\rဇ\u000b\u000eဇ\r\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0015\u0016ဇ\u0014\u0017ဇ\f\u0018ဇ\u0016\u0019ဇ\u0017\u001cဇ\u001a\u001dဇ\u001b\u001eဇ\u001c ဇ \"ဇ\u001e$ဇ\"%ဇ#&ဇ$'ဇ%(ဇ&)ဇ',ဇ*-ဇ+.ဇ,0ဇ.1င/4ဇ25ဇ36ဇ47ဇ5", new Object[]{"b", "O", "c", "d", "e", aujj.c, "f", "g", "h", "i", "j", "k", "m", "n", "o", "q", "p", "l", "r", "s", "t", "u", "v", "x", "w", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"});
            case NEW_MUTABLE_INSTANCE:
                return new aujz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = N;
                if (aopfVar == null) {
                    synchronized (aujz.class) {
                        aopfVar = N;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            N = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
