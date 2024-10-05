package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atoc extends aonm implements aooz {
    private static volatile aopf A;
    public static final atoc a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public aonu i = emptyIntList();
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        atoc atocVar = new atoc();
        a = atocVar;
        aonm.registerDefaultInstance(atoc.class, atocVar);
    }

    private atoc() {
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
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ဇ\u0005\u0007\u0016\bဇ\u0006\tင\u0007\nဇ\b\fဇ\t\rင\n\u000fဇ\u000e\u0010ဇ\u000f\u0014ဇ\u0013\u0015င\u0014\u0016င\u0015\u0017ဇ\u0016\u0018င\u0017\u0019င\u0018\u001aဇ\u000b\u001bဇ\f\u001cဇ\u0003\u001dဇ\u0019\u001eဇ\u001a", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "t", "u", "v", "w", "x", "o", "p", "f", "y", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new atoc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (atoc.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
