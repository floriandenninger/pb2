package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxq extends aonm implements aooz {
    public static final uxq a;
    private static volatile aopf i;
    public int b;
    public long f;
    public long g;
    public String c = "";
    public aomf d = aomf.b;
    public String e = "";
    public aony h = emptyProtobufList();

    static {
        uxq uxqVar = new uxq();
        a = uxqVar;
        aonm.registerDefaultInstance(uxq.class, uxqVar);
    }

    private uxq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", uxr.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new uxq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (uxq.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
