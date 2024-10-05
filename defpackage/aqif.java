package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqif extends aonm implements aooz {
    public static final aonv a = new uct(14);
    public static final aqif b;
    private static volatile aopf j;
    public int c;
    public long d;
    public aonu e = emptyIntList();
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        aqif aqifVar = new aqif();
        b = aqifVar;
        aonm.registerDefaultInstance(aqif.class, aqifVar);
    }

    private aqif() {
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
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0003\u001e\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"c", "d", "e", atfo.a(), "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqif();
            case NEW_BUILDER:
                return new aone((short[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqif.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
