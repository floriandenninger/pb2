package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyq extends aonh implements aoni {
    public static final aoyq a;
    private static volatile aopf g;
    public int b;
    public aoys d;
    public boolean e;
    public aowu f;
    private aota h;
    private byte i = 2;
    public String c = "";

    static {
        aoyq aoyqVar = new aoyq();
        a = aoyqVar;
        aonm.registerDefaultInstance(aoyq.class, aoyqVar);
    }

    private aoyq() {
        aomf aomfVar = aomf.b;
    }

    public static /* synthetic */ void a(aoyq aoyqVar) {
        aoyqVar.b |= 1;
        aoyqVar.c = "{TIME_REMAINING}";
    }

    public static /* synthetic */ void e(aoyq aoyqVar) {
        aoyqVar.b |= 4;
        aoyqVar.e = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyq();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aoyq.class) {
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
