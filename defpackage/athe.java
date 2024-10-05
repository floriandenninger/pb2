package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athe extends aonm implements aooz {
    public static final athe a;
    private static volatile aopf q;
    public int b;
    public apxf d;
    public apxf f;
    public apxf g;
    public aqyg h;
    public boolean i;
    public aulq j;
    public int k;
    public int l;
    public atdf m;
    public aulq n;
    public aqev o;
    private aulq r;
    private aota s;
    private byte t = 2;
    public aony c = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf p = aomf.b;

    static {
        athe atheVar = new athe();
        a = atheVar;
        aonm.registerDefaultInstance(athe.class, atheVar);
    }

    private athe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u000b\u0001Л\u0002ᐉ\u0000\u0003Л\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\n\u0007ᐉ\r\bည\u000e\tᐉ\u0005\nဋ\u0007\u000bဋ\b\fᐉ\t\u000eဉ\f\u000fᐉ\u0001\u0010ᐉ\u0006\u0011ᐉ\u0002", new Object[]{"b", "c", athd.class, "d", "e", apxf.class, "h", "i", "n", "s", "p", "j", "k", "l", "m", "o", "f", "r", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new athe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (athe.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
