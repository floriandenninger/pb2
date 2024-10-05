package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argu extends aonm implements aooz {
    public static final argu a;
    private static volatile aopf l;
    public int b;
    public aony d;
    public aony e;
    public aqyg f;
    public argt g;
    public args h;
    public args i;
    public long j;
    public apxf k;
    private aota m;
    private byte n = 2;
    public aony c = emptyProtobufList();

    static {
        argu arguVar = new argu();
        a = arguVar;
        aonm.registerDefaultInstance(argu.class, arguVar);
    }

    private argu() {
        aomf aomfVar = aomf.b;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0015\n\u0000\u0003\u0006\u0001Л\u0002ᐉ\u0000\t\u001b\u000b\u001b\rᐉ\u0002\u000eᐉ\u0004\u000fᐉ\u0005\u0012ဉ\u0003\u0013ဂ\u0007\u0015ᐉ\t", new Object[]{"b", "c", argz.class, "m", "d", asus.class, "e", asus.class, "f", "h", "i", "g", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new argu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (argu.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
