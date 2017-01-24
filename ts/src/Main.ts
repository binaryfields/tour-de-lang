import * as Arrays from './library/Arrays';
import * as Classes from './basic/Classes';
import * as Closures from './advanced/Closures';
import * as Collections from './library/Collections';
import * as FlowControl from './basic/FlowControl';
import * as Enums from './advanced/Enums';
import * as Functions from './basic/Functions';
import * as Futures from './library/Futures';
import * as Generics from './advanced/Generics';
import * as Http from './library/Http';
import * as Json from './library/Json';
import * as Modules from './basic/Modules';
import * as PatternMatching from './advanced/PatternMatching';
import * as Strings from './library/Strings';
import * as Tuples from './library/Tuples';
import * as Variables from './basic/Variables';

class Boot {
    public static main(): number {
        // Language Basics
        Variables.run();
        FlowControl.run();
        Functions.run();
        Classes.run();
        Modules.run();
        // Language Advanced
        Closures.run();
        Generics.run();
        Enums.run();
        PatternMatching.run();
        // Library
        Arrays.run();
        Collections.run();
        Futures.run();
        Http.run();
        Json.run();
        Strings.run();
        Tuples.run();
        return 0;
    }
}

Boot.main();
