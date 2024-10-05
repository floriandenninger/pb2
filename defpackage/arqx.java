package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqx extends aonm implements aooz {
    public static final arqx a;
    private static volatile aopf h;
    public Object c;
    public arnd d;
    public arqu e;
    private int i;
    private aota j;
    private aqzg k;
    public int b = 0;
    private byte l = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        arqx arqxVar = new arqx();
        a = arqxVar;
        aonm.registerDefaultInstance(arqx.class, arqxVar);
    }

    private arqx() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001̉\t\u0000\u0001\b\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ᐉ\u0005\bည\u0006\nᐼ\u0000̉ᐉ\u0007", new Object[]{"c", "b", "i", "d", "e", "f", arqt.class, arqv.class, arqs.class, "j", "g", aulq.class, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new arqx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arqx.class) {
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
