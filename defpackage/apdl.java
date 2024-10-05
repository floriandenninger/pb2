package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdl extends aonm implements aooz {
    public static final apdl a;
    private static volatile aopf p;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public aony i = emptyProtobufList();
    public boolean j;
    public float k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;

    static {
        apdl apdlVar = new apdl();
        a = apdlVar;
        aonm.registerDefaultInstance(apdl.class, apdlVar);
    }

    private apdl() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0002\u0018\r\u0000\u0001\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0006ဇ\u0004\u0007င\u0005\bင\u0006\t\u001b\nဇ\b\fခ\n\u0012ဇ\u0011\u0015ဇ\u0014\u0017ဇ\u0015\u0018ခ\u000b", new Object[]{"b", "c", "d", "e", apaf.l, "f", "g", "h", "i", apdk.class, "j", "k", "m", "n", "o", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apdl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (apdl.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
