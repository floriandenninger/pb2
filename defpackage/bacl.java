package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bacl extends aonm implements aooz {
    public static final bacl a;
    private static volatile aopf o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aony j = emptyProtobufList();
    public int k;
    public int l;
    public int m;
    public baco n;

    static {
        bacl baclVar = new bacl();
        a = baclVar;
        aonm.registerDefaultInstance(bacl.class, baclVar);
    }

    private bacl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "j", back.class, "k", "e", "g", "h", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new bacl();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (bacl.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
