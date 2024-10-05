package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ashl extends aonm implements aooz {
    public static final ashl a;
    public static final aonk b;
    private static volatile aopf o;
    public int c;
    public int d = -1;
    public int e = -1;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        ashl ashlVar = new ashl();
        a = ashlVar;
        aonm.registerDefaultInstance(ashl.class, ashlVar);
        b = aonm.newSingularGeneratedExtension(apxg.a, ashlVar, ashlVar, null, 288976216, aoqn.MESSAGE, ashl.class);
    }

    private ashl() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\fဌ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", aqkw.b});
            case NEW_MUTABLE_INSTANCE:
                return new ashl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (ashl.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
