package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnl extends aonm implements aooz {
    public static final arnl a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public arnm f;
    private apxf h;
    private apxf i;
    private apxf j;
    private apxf k;
    private apxf l;
    private byte m = 2;
    public String d = "";
    public aony e = emptyProtobufList();

    static {
        arnl arnlVar = new arnl();
        a = arnlVar;
        aonm.registerDefaultInstance(arnl.class, arnlVar);
    }

    private arnl() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\b\u0001ᐉ\u0000\u0003ဈ\u0001\u0004Л\u0005ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0003\tᐉ\u0004\u000bᐉ\u0006\fᐉ\u0007", new Object[]{"b", "c", "d", "e", arnj.class, "h", "f", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new arnl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arnl.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
