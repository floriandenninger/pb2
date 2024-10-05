package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apcn extends aonm implements aooz {
    public static final apcn a;
    private static volatile aopf g;
    public int b;
    public apxf f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public aony e = emptyProtobufList();

    static {
        apcn apcnVar = new apcn();
        a = apcnVar;
        aonm.registerDefaultInstance(apcn.class, apcnVar);
    }

    private apcn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e", askp.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apcn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apcn.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
