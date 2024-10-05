package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atga extends aonm implements aooz {
    public static final atga a;
    private static volatile aopf d;
    public int c;
    private int e;
    private aqyg f;
    private byte g = 2;
    public aony b = emptyProtobufList();

    static {
        atga atgaVar = new atga();
        a = atgaVar;
        aonm.registerDefaultInstance(atga.class, atgaVar);
    }

    private atga() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဌ\u0001", new Object[]{"e", "b", atfz.class, "f", "c", atbk.q});
            case NEW_MUTABLE_INSTANCE:
                return new atga();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atga.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
