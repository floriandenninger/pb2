package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphg extends aonh implements aoni {
    public static final aphg a;
    private static volatile aopf e;
    private int f;
    private aqyg g;
    private aota h;
    private aphd i;
    private byte j = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        aphg aphgVar = new aphg();
        a = aphgVar;
        aonm.registerDefaultInstance(aphg.class, aphgVar);
    }

    private aphg() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0006\u0001Л\u0002ᐉ\u0001\u0004Л\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0006", new Object[]{"f", "b", aphf.class, "g", "c", aphf.class, "h", "d", aphf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aphg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aphg.class) {
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
