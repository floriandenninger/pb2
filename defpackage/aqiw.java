package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqiw extends aonm implements aooz {
    public static final aqiw a;
    private static volatile aopf e;
    public int b;
    public aqiy c;
    public aoot d = aoot.a;
    private byte f = 2;

    static {
        aqiw aqiwVar = new aqiw();
        a = aqiwVar;
        aonm.registerDefaultInstance(aqiw.class, aqiwVar);
    }

    private aqiw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ဉ\u0000\u0002в", new Object[]{"b", "c", "d", aqiv.a});
            case NEW_MUTABLE_INSTANCE:
                return new aqiw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqiw.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
