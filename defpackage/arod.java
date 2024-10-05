package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arod extends aonm implements aooz {
    public static final arod a;
    private static volatile aopf i;
    public int b;
    public arnb c;
    public arog e;
    public arof h;
    private byte j = 2;
    public aony d = emptyProtobufList();
    public String f = "";
    public String g = "";

    static {
        arod arodVar = new arod();
        a = arodVar;
        aonm.registerDefaultInstance(arod.class, arodVar);
    }

    private arod() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0007ဈ\u0003\bဈ\u0004\tဉ\u0002\nဉ\u0005\u000b\u001b", new Object[]{"b", "c", "f", "g", "e", "h", "d", aroj.class});
            case NEW_MUTABLE_INSTANCE:
                return new arod();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arod.class) {
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
