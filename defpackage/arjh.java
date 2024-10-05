package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjh extends aonm implements aooz {
    public static final arjh a;
    private static volatile aopf f;
    public arnd b;
    public int c;
    public int d;
    private int g;
    private byte h = 2;
    public aony e = emptyProtobufList();

    static {
        arjh arjhVar = new arjh();
        a = arjhVar;
        aonm.registerDefaultInstance(arjh.class, arjhVar);
    }

    private arjh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဋ\u0001\u0003Л\u0005ဋ\u0002", new Object[]{"g", "b", "c", "e", arje.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new arjh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arjh.class) {
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
