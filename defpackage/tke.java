package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tke extends aonm implements aooz {
    public static final tke a;
    private static volatile aopf f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        tke tkeVar = new tke();
        a = tkeVar;
        aonm.registerDefaultInstance(tke.class, tkeVar);
    }

    private tke() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u000f\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0007ဈ\u0000\u000fဌ\u0003", new Object[]{"b", "d", "c", "e", sgo.h});
            case NEW_MUTABLE_INSTANCE:
                return new tke();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (tke.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
