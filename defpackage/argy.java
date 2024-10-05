package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argy extends aonm implements aooz {
    public static final argy a;
    private static volatile aopf g;
    public arha b;
    public argv c;
    public args e;
    public boolean f;
    private int h;
    private aota i;
    private byte j = 2;
    public aony d = emptyProtobufList();

    static {
        argy argyVar = new argy();
        a = argyVar;
        aonm.registerDefaultInstance(argy.class, argyVar);
    }

    private argy() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0007ဇ\u0005", new Object[]{"h", "b", "c", "d", argw.class, "i", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new argy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (argy.class) {
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
