package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fke extends aonm implements aooz {
    public static final fke a;
    private static volatile aopf i;
    public int b;
    public boolean c;
    public long f;
    public int h;
    public aoot g = aoot.a;
    public boolean d = true;
    public boolean e = true;

    static {
        fke fkeVar = new fke();
        a = fkeVar;
        aonm.registerDefaultInstance(fke.class, fkeVar);
    }

    private fke() {
    }

    public final boolean a(int i2) {
        return this.g.containsKey(Integer.valueOf(i2));
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u00052\u0006င\u0004", new Object[]{"b", "c", "d", "e", "f", "g", fkd.a, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new fke();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (fke.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
