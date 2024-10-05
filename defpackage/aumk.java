package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumk extends aonm implements aooz {
    public static final aumk a;
    private static volatile aopf p;
    public int b;
    public aony c = aonm.emptyProtobufList();
    public aony d = aonm.emptyProtobufList();
    public aony e = aonm.emptyProtobufList();
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    static {
        aumk aumkVar = new aumk();
        a = aumkVar;
        aonm.registerDefaultInstance(aumk.class, aumkVar);
    }

    private aumk() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\u0000\u0001\u001a\u0002င\u0000\u0003င\u0001\u0004ဇ\u0003\u0006ဇ\u0006\u0007ဇ\u0007\u000bဇ\r\rင\t\u000f\u001a\u0010ဇ\u000e\u0011ဇ\n\u0012ဇ\u000f\u0013\u001a", new Object[]{"b", "c", "f", "g", "h", "i", "j", "m", "k", "d", "n", "l", "o", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aumk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aumk.class) {
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
