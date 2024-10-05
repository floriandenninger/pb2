package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqkv extends aonm implements aooz {
    public static final aqkv a;
    private static volatile aopf i;
    public int b;
    public arfs c;
    public aota g;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public aony f = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        aqkv aqkvVar = new aqkv();
        a = aqkvVar;
        aonm.registerDefaultInstance(aqkv.class, aqkvVar);
    }

    private aqkv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001ဈ\u0002\u0002ᐉ\u0003\u0003ည\u0004\u0004ဈ\u0001\u0005ᐉ\u0000\u0006Л", new Object[]{"b", "e", "g", "h", "d", "c", "f", aqyg.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqkv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqkv.class) {
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
