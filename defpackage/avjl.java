package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjl extends aonm implements aooz {
    public static final avjl a;
    private static volatile aopf f;
    public long c;
    public long d;
    public apxf e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        avjl avjlVar = new avjl();
        a = avjlVar;
        aonm.registerDefaultInstance(avjl.class, avjlVar);
    }

    private avjl() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ᐉ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avjl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avjl.class) {
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
