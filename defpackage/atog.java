package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atog extends aonm implements aooz {
    public static final atog a;
    private static volatile aopf p;
    public int b;
    public atof c;
    public boolean d;
    public boolean e;
    public atoc f;
    public apcw g;
    public atob h;
    public atod i;
    public boolean j;
    public int k;
    public boolean l;
    public atoe m;
    public boolean n;
    public boolean o;

    static {
        atog atogVar = new atog();
        a = atogVar;
        aonm.registerDefaultInstance(atog.class, atogVar);
    }

    private atog() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0004\u001a\r\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဇ\u0004\u0007ဉ\u0006\bဉ\t\tဇ\u0005\nဇ\n\fင\u000b\rဇ\f\u0010ဉ\u0007\u0013ဉ\u000e\u0015ဉ\b\u0019ဇ\u0012\u001aဇ\u0013", new Object[]{"b", "c", "d", "f", "i", "e", "j", "k", "l", "g", "m", "h", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new atog();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (atog.class) {
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
