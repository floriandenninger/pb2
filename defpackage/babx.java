package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babx extends aonm implements aooz {
    public static final babx a;
    private static volatile aopf g;
    public int b;
    public long c;
    public int d;
    public bacb f;
    private byte h = 2;
    public aony e = emptyProtobufList();

    static {
        babx babxVar = new babx();
        a = babxVar;
        aonm.registerDefaultInstance(babx.class, babxVar);
    }

    private babx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", baby.class, "d", babw.a, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new babx();
            case NEW_BUILDER:
                return new aone((short[][][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (babx.class) {
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
