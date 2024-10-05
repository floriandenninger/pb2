package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arej extends aonm implements aooz {
    public static final arej a;
    private static volatile aopf k;
    public int b;
    public areg d;
    public areh e;
    public long f;
    public arei g;
    public arek h;
    public aref i;
    private aota l;
    private byte m = 2;
    public String c = "";
    public aony j = emptyProtobufList();

    static {
        arej arejVar = new arej();
        a = arejVar;
        aonm.registerDefaultInstance(arej.class, arejVar);
    }

    private arej() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007Л\bဉ\u0006\nᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", apxf.class, "i", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new arej();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arej.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
