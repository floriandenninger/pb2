package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asyt extends aonm implements aooz {
    public static final asyt a;
    public static final aonk b;
    private static volatile aopf k;
    public int c;
    public String d = "";
    public String e;
    public int f;
    public boolean g;
    public asys h;
    public int i;
    public String j;

    static {
        asyt asytVar = new asyt();
        a = asytVar;
        aonm.registerDefaultInstance(asyt.class, asytVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, asytVar, asytVar, null, 196, aoqn.MESSAGE, asyt.class);
    }

    private asyt() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.j = "";
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဈ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", asyu.a(), "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asyt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (asyt.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
