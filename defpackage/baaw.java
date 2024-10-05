package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baaw extends aonm implements aooz {
    public static final baaw a;
    private static volatile aopf l;
    public int b;
    public int c;
    public long d;
    public babg g;
    public int h;
    public long i;
    public babf j;
    public long k;
    private byte m = 2;
    public String e = "";
    public String f = "";

    static {
        baaw baawVar = new baaw();
        a = baawVar;
        aonm.registerDefaultInstance(baaw.class, baawVar);
    }

    private baaw() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"b", "c", baav.a(), "h", baav.a(), "i", "j", "k", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new baaw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (baaw.class) {
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
