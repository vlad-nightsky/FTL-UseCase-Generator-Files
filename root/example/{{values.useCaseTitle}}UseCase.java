package {{meta.project}}.domain.{{meta.domain}}.usecases;

import com.rcore.domain.commons.usecase.UseCase;
import com.rcore.domain.commons.usecase.model.SingletonEntityOutputValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import {{meta.project}}.domain.{{meta.domain}}.entity.{{data.output}};

/**
 * {{data.description}}
 */
@RequiredArgsConstructor
public class {{data.useCaseTitle}}UseCase extends UseCase<{{data.useCaseTitle}}.InputValues, SingletonEntityOutputValues<{{data.output}}>> {

    @Override
    public SingletonEntityOutputValues<{{data.output}}> execute(InputValues inputValues) {
        {{data.output}} {{data.outputVar}};

        return SingletonEntityOutputValues.of({{data.outputVar}});
    }

    @AllArgsConstructor(staticName = "of")
    @Getter
    public static class InputValues implements UseCase.InputValues {
    }

}
