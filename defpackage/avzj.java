package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzj extends aonm implements aooz {
    public static final avzj a;
    private static volatile aopf b;
    private int c;
    private avvv d;
    private atdc e;
    private byte f = 2;

    static {
        avzj avzjVar = new avzj();
        a = avzjVar;
        aonm.registerDefaultInstance(avzj.class, avzjVar);
    }

    private avzj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ueaaaᾮ\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaaᾮᐉ\u0001\uf6ae\u2fd9ᐉ\u0000", new Object[]{"c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avzj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avzj.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
