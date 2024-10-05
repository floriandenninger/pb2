package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appk extends aonm implements aooz {
    public static final appk a;
    public static final aonk b;
    private static volatile aopf m;
    public int c;
    public boolean e;
    public int g;
    public boolean j;
    public boolean k;
    public boolean l;
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        appk appkVar = new appk();
        a = appkVar;
        aonm.registerDefaultInstance(appk.class, appkVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, appkVar, appkVar, null, 218, aoqn.MESSAGE, appk.class);
    }

    private appk() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"c", "d", "e", "f", "g", atvp.a(), "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new appk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (appk.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
