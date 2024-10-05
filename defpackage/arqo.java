package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqo extends aonm implements aooz {
    public static final arqo a;
    private static volatile aopf i;
    public int b;
    public arnd c;
    public aulq e;
    public int f;
    public aulq g;
    public aulq h;
    private aqzg j;
    private byte k = 2;
    public aony d = emptyProtobufList();

    static {
        arqo arqoVar = new arqo();
        a = arqoVar;
        aonm.registerDefaultInstance(arqo.class, arqoVar);
    }

    private arqo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0006ဌ\u0002\u0007ᐉ\u0003\bᐉ\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", aulq.class, "e", "f", attp.a(), "g", "h", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arqo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arqo.class) {
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
