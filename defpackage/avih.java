package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avih extends aonh implements aoni {
    public static final avih a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public avgg d;
    public boolean e;
    private aota j;
    private apxf k;
    private apxf m;
    private byte n = 2;
    public String f = "";
    public aony g = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        avih avihVar = new avih();
        a = avihVar;
        aonm.registerDefaultInstance(avih.class, avihVar);
    }

    private avih() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ည\b\u0007Л\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "j", "h", "g", avie.class, "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new avih();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avih.class) {
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
