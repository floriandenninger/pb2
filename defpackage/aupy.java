package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupy extends aonm implements aooz {
    public static final aupy a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public int e;
    private aqyg h;
    private apxf i;
    private aota j;
    private byte k = 2;
    private String g = "";
    public aony d = emptyProtobufList();

    static {
        aupy aupyVar = new aupy();
        a = aupyVar;
        aonm.registerDefaultInstance(aupy.class, aupyVar);
    }

    private aupy() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004Л\u0006ဌ\u0005\u0007ဈ\u0000\bᐉ\u0006", new Object[]{"b", "c", "h", "i", "d", aupw.class, "e", auqy.b, "g", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aupy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aupy.class) {
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
