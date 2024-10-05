package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athl extends aonm implements aooz {
    public static final athl a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        athl athlVar = new athl();
        a = athlVar;
        aonm.registerDefaultInstance(athl.class, athlVar);
    }

    private athl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued6a▻\ue05a䱤\u0003\u0000\u0000\u0003\ued6a▻ᐼ\u0000\ueb6b⳹ᐼ\u0000\ue05a䱤ᐼ\u0000", new Object[]{"c", "b", aqbs.class, apib.class, avhq.class});
            case NEW_MUTABLE_INSTANCE:
                return new athl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (athl.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
