package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqh extends aonm implements aooz {
    public static final arqh a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public aqyg d;
    public arqf e;
    public arqk f;
    private byte i = 2;
    public aony g = emptyProtobufList();

    static {
        arqh arqhVar = new arqh();
        a = arqhVar;
        aonm.registerDefaultInstance(arqh.class, arqhVar);
    }

    private arqh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007Л", new Object[]{"b", "c", "d", "e", "f", "g", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arqh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arqh.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
