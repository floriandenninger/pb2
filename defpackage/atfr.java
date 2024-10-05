package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfr extends aonm implements aooz {
    public static final atfr a;
    private static volatile aopf m;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public aplz h;
    public boolean i;
    public aonu j;
    public atmg k;
    public awdx l;
    private int n;

    static {
        atfr atfrVar = new atfr();
        a = atfrVar;
        aonm.registerDefaultInstance(atfr.class, atfrVar);
    }

    private atfr() {
        emptyIntList();
        aonm.emptyProtobufList();
        this.j = emptyIntList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u000b'\u000b\u0000\u0001\u0000\u000bဇ\u0006\rဇ\b\u0019ဇ\u000f\u001fဇ\u0015 ဇ\u0016\"ဇ\u0018#ဉ\u0019$ဇ\u001a%\u0016&ဉ\u001b'ဉ\u001c", new Object[]{"n", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atfr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atfr.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
