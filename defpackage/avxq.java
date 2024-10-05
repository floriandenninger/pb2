package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxq extends aonm implements aooz {
    public static final avxq a;
    private static volatile aopf f;
    public aqyg d;
    private int g;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public aony e = aonm.emptyProtobufList();

    static {
        avxq avxqVar = new avxq();
        a = avxqVar;
        aonm.registerDefaultInstance(avxq.class, avxqVar);
    }

    private avxq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0002\u0003\u001a\u0004ဈ\u0001", new Object[]{"g", "b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avxq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avxq.class) {
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
